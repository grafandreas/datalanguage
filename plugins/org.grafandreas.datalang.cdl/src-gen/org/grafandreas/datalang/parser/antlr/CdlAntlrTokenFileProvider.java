/*
 * generated by Xtext 2.25.0
 */
package org.grafandreas.datalang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CdlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/grafandreas/datalang/parser/antlr/internal/InternalCdl.tokens");
	}
}
