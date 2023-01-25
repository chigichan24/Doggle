package net.chigita.doggle

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated

/**
 * A processor class for doggle.
 */
class DoggleProcessor(
    private val codeGenerator: CodeGenerator,
) : SymbolProcessor{

    private var invoked = false

    override fun process(resolver: Resolver): List<KSAnnotated> {
        invoked = true
        return emptyList()
    }
}
