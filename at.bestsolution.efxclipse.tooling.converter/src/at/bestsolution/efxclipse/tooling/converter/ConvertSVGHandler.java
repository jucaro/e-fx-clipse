package at.bestsolution.efxclipse.tooling.converter;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;

import at.bestsolution.efxclipse.formats.svg.converter.FXMLConverter;
import at.bestsolution.efxclipse.formats.svg.handler.XMLLoader;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;

public class ConvertSVGHandler extends AbstractConverterHandler {

	@Override
	protected String convert(IFile file) throws ExecutionException {
		try {
			XMLLoader loader = new XMLLoader();
			SvgSvgElement root = loader.loadDocument(file.getContents());
			return new FXMLConverter(root).generate().toString();
		} catch (Exception e) {
			throw new ExecutionException("Conversion failed", e);
		}
	}

}
