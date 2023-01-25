package net.chigita.doggle

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

/**
 * A class that provides [SymbolProcessor] for doggle.
 */
internal class DoggleProcessorProvider: SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor =
        DoggleProcessor(environment.codeGenerator)
}
