#!/bin/bash
cd `dirname $0`
# Constatnts
DIR_ROOT=$PWD # PWD is the working directory var
DIR_SOURCE_ECLIPSE="$DIR_ROOT/builder"
DIR_TARGETPLATFORMS="$DIR_ROOT/targetplatforms"
DIR_OUTPUT="$DIR_ROOT/output"
DIR_TMP="$DIR_ROOT/tmp"
DIR_REPOSITORIES="$DIR_ROOT/repositories"
DIR_ADDITIONAL_PLUGINS="$DIR_ROOT/additionalplugins"

EFX_VERSION="0.0.11"
IDEPREFIX="eclipse-SDK"
ZIPSUFFIX=".zip"
JARSUFFIX=".jar"
SEDEXPRESSION="s/^$IDEPREFIX-\([0-9\.]*\)\([^-]*\)-\(.*\)/$IDEPREFIX-\1\2-efxclipse-$EFX_VERSION-\3/"

#STATIC_IUS="org.eclipse.team.svn.feature.group,\
#org.polarion.eclipse.team.svn.connector.feature.group,\
#org.polarion.eclipse.team.svn.connector.javahl16.feature.group,\
#org.polarion.eclipse.team.svn.connector.svnkit16.feature.group"

INSTALL_IUS="org.eclipse.emf.sdk.feature.group,org.eclipse.xtext.sdk.feature.group,\
org.eclipse.xtext.xtend2.sdk.feature.group,org.eclipse.emf.mwe2.runtime.sdk.feature.group,at.bestsolution.efxclipse.feature.feature.group,\
org.eclipse.egit.feature.group,org.tigris.subversion.clientadapter.feature.feature.group,\
org.tigris.subversion.clientadapter.javahl.feature.feature.group,\
org.tigris.subversion.subclipse.feature.group,\
org.tigris.subversion.clientadapter.svnkit.feature.feature.group,\
org.eclipse.e4.core.tools.feature.feature.group,\
mercurialeclipse.feature.group"
#org.eclipse.e4.tools.e3x.bridge.feature.feature.group"
# INSTALL_IUS="org.eclipse.xtext.sdk37.feature.feature.group"
#"org.eclipse.emf.all.feature.group,\
#org.eclipse.emf.mwe2.runtime.sdk.feature.group,\
#org.eclipse.emf.mwe.sdk.feature.group,\
#org.eclipse.xpand.sdk.feature.group,\
#org.eclipse.xtext.sdk.feature.group,\
#de.itemis.xtext.antlr.sdk.feature.group,\
#org.eclipse.emf.mwe2.language.sdk.feature.group,\
#org.eclipse.emf.compare.sdk.feature.group,$STATIC_IUS"

# uncompress to tmp folder
# USAGE: uncompress file [ todir ]
function uncompress()
{
  if [[ "$1" == *"$ZIPSUFFIX" ]] || [[ "$1" == *"$JARSUFFIX" ]]
  then
    unzip -q -d "$2" "$1"
  else
    tar xzf "$1" -C "$2"
  fi
}

function compress()
{
  if [[ "$1" == *"$ZIPSUFFIX" ]]
  then
    zip -q -r "$1" "eclipse"
  else
    tar czf "$1" "eclipse"
  fi
}

# Create dirs
echo "creating directories..."
mkdir -v $DIR_TMP $DIR_OUTPUT
echo "mkdir: finished"

#collect repos
cd $DIR_REPOSITORIES
# we are in $DIR_REPOSITORIES now
i=0
repository_urls=""
for file in *
do
 if [[ "$file" == *".zip" ]] # only update zips
  then
    echo "adding repository $file"
	#jar:file:/Users/huebner/Downloads/emft-mwe-Update-1.0.0RC2.zip!/
	fqn="jar:file:$DIR_REPOSITORIES/$file!/"
	if [[ $i == 0 ]]
	 then
	  repository_urls="$fqn"
	 else
	  repository_urls="$repository_urls,$fqn"
	fi
	i=$i+1
 fi
done
repository_urls="$repository_urls,http://download.eclipse.org/e4/downloads/drops/S-0.12M4-201112092100/repository,http://download.eclipse.org/releases/juno/,http://download.eclipse.org/egit/updates,http://www.efxclipse.org/p2-repos/releases/0.0.11/,http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/,http://cbes.javaforge.com/update" 
cd $DIR_ROOT
# we are in root now

# uncompress ides
cd $DIR_TARGETPLATFORMS
# we are in $DIR_TARGETPLATFORMS now
for file in *
do
 if [[ "$file" == *"$IDEPREFIX"* ]] # only ide
  then
	echo ""
    echo "processing $file"
	echo "uncompress $file to $DIR_TMP"
    uncompress "$file" "$DIR_TMP/"
	
    echo "Starting p2 director..."
    $DIR_SOURCE_ECLIPSE/eclipse -nosplash -application org.eclipse.equinox.p2.director -consoleLog -repository $repository_urls\
		-installIU $INSTALL_IUS -destination $DIR_TMP/eclipse -profile SDKProfile\
		-profileProperties org.eclipse.update.install.features=true
	echo "installing done..."
 
	echo "copying additional plugins... "
	cp -v $DIR_ADDITIONAL_PLUGINS/*.jar $DIR_TMP/eclipse/plugins/
	echo "copying done..."
	
	#echo "Starting p2 director for orbit..."
    #-repository jar:file:$DIR_ROOT/orbit/orbit-S20100519200754.zip!/
	#$DIR_SOURCE_ECLIPSE/eclipse -nosplash -application org.eclipse.equinox.p2.director -consoleLog\
	#	-repository http://download.eclipse.org/tools/orbit/downloads/drops/S20100519200754/repository\
	#	-installIU org.easymock -destination $DIR_TMP/eclipse -profile SDKProfile -profileProperties org.eclipse.update.install.features=true
	#echo "installing Orbit bundles done..."
  
    # include xtext into filename
    renamed=`echo $file | sed $SEDEXPRESSION`
	cd $DIR_TMP
    # we are in $DIR_TMP now
	echo "compressing in $renamed"
	compress $renamed
	echo "moving $renamed in $DIR_OUTPUT"
	mv $renamed $DIR_OUTPUT
	echo "cleaning up tmp folder..."
	rm -r *
    cd $DIR_TARGETPLATFORMS
	# we are in $DIR_TARGETPLATFORMS again
 fi
done
# we are stil in $DIR_TARGETPLATFORMS
rm -r $DIR_TMP
exit 0 

