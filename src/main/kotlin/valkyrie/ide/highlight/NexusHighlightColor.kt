package valkyrie.ide.highlight

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts.AttributeDescriptor
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default


enum class NexusHighlightColor(humanName: Supplier<@AttributeDescriptor String>, default: TextAttributesKey? = null) {
    // 特殊关键词
    KEYWORD(OptionsBundle.messagePointer("options.language.defaults.keyword"), Default.KEYWORD),
    MODIFIER(dejavu.language.NexusBundle.messagePointer("valkyrie.highlight.modifier"), Default.KEYWORD),

    // 字面量
    NULL(dejavu.language.NexusBundle.messagePointer("color.token.null"), Default.KEYWORD),
    BOOLEAN(dejavu.language.NexusBundle.messagePointer("color.token.boolean"), Default.KEYWORD),
    BYTE(dejavu.language.NexusBundle.messagePointer("color.token.byte"), Default.NUMBER),
    INTEGER(dejavu.language.NexusBundle.messagePointer("color.token.integer"), Default.NUMBER),
    DECIMAL(dejavu.language.NexusBundle.messagePointer("color.token.decimal"), Default.NUMBER),
    STRING(dejavu.language.NexusBundle.messagePointer("color.token.string"), Default.STRING),
    TEXT(dejavu.language.NexusBundle.messagePointer("color.token.text"), STRING.textAttributesKey),
    STRING_ESCAPED(dejavu.language.NexusBundle.messagePointer("color.token.text"), Default.VALID_STRING_ESCAPE),
    STRING_BAD(dejavu.language.NexusBundle.messagePointer("color.token.text"), Default.INVALID_STRING_ESCAPE),

    // 标识符
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),
    SYM_TYPE(dejavu.language.NexusBundle.messagePointer("color.token.symbol.trait"), Default.CLASS_REFERENCE),
    SYM_GENERIC(dejavu.language.NexusBundle.messagePointer("color.token.symbol.trait"), Default.METADATA),
    SYM_LANGUAGE(dejavu.language.NexusBundle.messagePointer("color.token.symbol.trait"), Default.INTERFACE_NAME),
    SYM_CLASS(dejavu.language.NexusBundle.messagePointer("color.token.symbol.class"), Default.CLASS_NAME),
    SYM_VARIANT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.variant"), Default.STATIC_FIELD),
    SYM_MACRO(dejavu.language.NexusBundle.messagePointer("color.token.symbol.macro"), Default.METADATA),
    SYM_LOCAL(dejavu.language.NexusBundle.messagePointer("color.token.symbol.local"), Default.LOCAL_VARIABLE),
    SYM_LOCAL_MUT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.local.mutable"), Default.REASSIGNED_LOCAL_VARIABLE),
    SYM_GLOBAL(dejavu.language.NexusBundle.messagePointer("color.token.symbol.global"), Default.GLOBAL_VARIABLE),
    SYM_GLOBAL_MUT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.global.mut"), Default.GLOBAL_VARIABLE),
    SYM_ARG(dejavu.language.NexusBundle.messagePointer("color.token.symbol.parameter"), Default.PARAMETER),
    SYM_ARG_MUT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.parameter.mutable"), Default.REASSIGNED_PARAMETER),
    SYM_ARG_SELF(dejavu.language.NexusBundle.messagePointer("color.token.symbol.self"), Default.KEYWORD),
    SYM_ARG_SELF_MUT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.self.mutable"), Default.KEYWORD),
    SYM_FIELD(dejavu.language.NexusBundle.messagePointer("color.token.symbol.field"), Default.INSTANCE_FIELD),
    SYM_CONSTANT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.constant"), Default.CONSTANT),
    SYM_FUNCTION_SELF(dejavu.language.NexusBundle.messagePointer("color.token.symbol.function.self"), Default.INSTANCE_METHOD),
    SYM_FUNCTION_FREE(dejavu.language.NexusBundle.messagePointer("color.token.symbol.function.free"), Default.STATIC_METHOD),

    //
    TYPE_HINT(dejavu.language.NexusBundle.messagePointer("color.token.symbol.type"), Default.CLASS_NAME),

    // 标点符号
    ASSIGN(dejavu.language.NexusBundle.messagePointer("color.token.set"), Default.OPERATION_SIGN),
    OP_NUMBER(dejavu.language.NexusBundle.messagePointer("color.token.number.suffix"), Default.METADATA),
    OP_STRING(dejavu.language.NexusBundle.messagePointer("color.token.string.prefix"), Default.KEYWORD),
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("voml.lang.$name", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
