package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.BrailleSymbolType;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolUsageRule.*;

public class UEBSymbolDatabase extends BrailleSymbolDatabase
{
	/**
	 * make the array of all the entries in the database
	 * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
	 * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
	 * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
	 * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
	 */

	public static final BrailleSymbolType WORDSIGN = new BrailleSymbolType(R.string.symbol_wordsign, R.string.symbol_wordsign_desc);
	public static final BrailleSymbolType GROUPSIGN = new BrailleSymbolType(R.string.symbol_groupsign, R.string.symbol_groupsign_desc);
	public static final BrailleSymbolType INITIALLETTERCONTRACTION = new BrailleSymbolType(R.string.symbol_initiallettercontraction, R.string.symbol_initiallettercontraction_desc);
	public static final BrailleSymbolType FINALLETTERCONTRACTION = new BrailleSymbolType(R.string.symbol_finallettercontraction, R.string.symbol_finallettercontraction_desc);
	public static final BrailleSymbolType SHORTFORM = new BrailleSymbolType(R.string.symbol_shortform, R.string.symbol_shortform_desc);

	private static final BrailleSymbolDataEntry[] allSymbols = {

			new BrailleSymbolDataEntry("a", LETTER, CellA),
			new BrailleSymbolDataEntry("b", LETTER, CellB),
			new BrailleSymbolDataEntry("c", LETTER, CellC),
			new BrailleSymbolDataEntry("d", LETTER, CellD),
			new BrailleSymbolDataEntry("e", LETTER, CellE),
			new BrailleSymbolDataEntry("f", LETTER, CellF),
			new BrailleSymbolDataEntry("g", LETTER, CellG),
			new BrailleSymbolDataEntry("h", LETTER, CellH),
			new BrailleSymbolDataEntry("i", LETTER, CellI),
			new BrailleSymbolDataEntry("j", LETTER, CellJ),
			new BrailleSymbolDataEntry("k", LETTER, CellK),
			new BrailleSymbolDataEntry("l", LETTER, CellL),
			new BrailleSymbolDataEntry("m", LETTER, CellM),
			new BrailleSymbolDataEntry("n", LETTER, CellN),
			new BrailleSymbolDataEntry("o", LETTER, CellO),
			new BrailleSymbolDataEntry("p", LETTER, CellP),
			new BrailleSymbolDataEntry("q", LETTER, CellQ),
			new BrailleSymbolDataEntry("r", LETTER, CellR),
			new BrailleSymbolDataEntry("s", LETTER, CellS),
			new BrailleSymbolDataEntry("t", LETTER, CellT),
			new BrailleSymbolDataEntry("u", LETTER, CellU),
			new BrailleSymbolDataEntry("v", LETTER, CellV),
			new BrailleSymbolDataEntry("w", LETTER, CellW),
			new BrailleSymbolDataEntry("x", LETTER, CellX),
			new BrailleSymbolDataEntry("y", LETTER, CellY),
			new BrailleSymbolDataEntry("z", LETTER, CellZ),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, CellNumbersign),
			new BrailleSymbolDataEntry("1", NUMBER, CellA),
			new BrailleSymbolDataEntry("2", NUMBER, CellB),
			new BrailleSymbolDataEntry("3", NUMBER, CellC),
			new BrailleSymbolDataEntry("4", NUMBER, CellD),
			new BrailleSymbolDataEntry("5", NUMBER, CellE),
			new BrailleSymbolDataEntry("6", NUMBER, CellF),
			new BrailleSymbolDataEntry("7", NUMBER, CellG),
			new BrailleSymbolDataEntry("8", NUMBER, CellH),
			new BrailleSymbolDataEntry("9", NUMBER, CellI),
			new BrailleSymbolDataEntry("0", NUMBER, CellJ),
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, CellFullstop),
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, CellComma),

			new BrailleSymbolDataEntry(" ", INVISIBLE, CellWhitespace),

			new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, CellFullstop),
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, CellQuestionmark),
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, CellExclamationmark),
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, CellComma),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, CellColon),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, CellSemicolon),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, CellApostrophe),
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, CellHyphen),
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, CellQuestionmark),
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, CellCloseQuote),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, Cell56),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, CellCapitalsign),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, CellCapitalsign, CellCapitalsign),
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, Cell5, CellIN),
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, Cell5, CellGH),
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, Cell5, CellAR),
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, Cell456, CellST),

			new BrailleSymbolDataEntry("but", STANDALONE, WORDSIGN, CellB),
			new BrailleSymbolDataEntry("can", STANDALONE, WORDSIGN, CellC),
			new BrailleSymbolDataEntry("do", STANDALONE, WORDSIGN, CellD),
			new BrailleSymbolDataEntry("every", STANDALONE, WORDSIGN, CellE),
			new BrailleSymbolDataEntry("from", STANDALONE, WORDSIGN, CellF),
			new BrailleSymbolDataEntry("go", STANDALONE, WORDSIGN, CellG),
			new BrailleSymbolDataEntry("have", STANDALONE, WORDSIGN, CellH),
			new BrailleSymbolDataEntry("just", STANDALONE, WORDSIGN, CellJ),
			new BrailleSymbolDataEntry("knowledge", STANDALONE, WORDSIGN, CellK),
			new BrailleSymbolDataEntry("like", STANDALONE, WORDSIGN, CellL),
			new BrailleSymbolDataEntry("more", STANDALONE, WORDSIGN, CellM),
			new BrailleSymbolDataEntry("not", STANDALONE, WORDSIGN, CellN),
			new BrailleSymbolDataEntry("people", STANDALONE, WORDSIGN, CellP),
			new BrailleSymbolDataEntry("quite", STANDALONE, WORDSIGN, CellQ),
			new BrailleSymbolDataEntry("rather", STANDALONE, WORDSIGN, CellR),
			new BrailleSymbolDataEntry("so", STANDALONE, WORDSIGN, CellS),
			new BrailleSymbolDataEntry("that", STANDALONE, WORDSIGN, CellT),
			new BrailleSymbolDataEntry("us", STANDALONE, WORDSIGN, CellU),
			new BrailleSymbolDataEntry("very", STANDALONE, WORDSIGN, CellV),
			new BrailleSymbolDataEntry("will", STANDALONE, WORDSIGN, CellW),
			new BrailleSymbolDataEntry("it", STANDALONE, WORDSIGN, CellX),
			new BrailleSymbolDataEntry("you", STANDALONE, WORDSIGN, CellY),
			new BrailleSymbolDataEntry("as", STANDALONE, WORDSIGN, CellZ),

			new BrailleSymbolDataEntry("gg", SURROUNDED, GROUPSIGN, CellGG),
			new BrailleSymbolDataEntry("were", STANDALONE, WORDSIGN, CellGG),
			new BrailleSymbolDataEntry("st", GROUPSIGN, CellST),
			new BrailleSymbolDataEntry("still", STANDALONE, WORDSIGN, CellST),
			new BrailleSymbolDataEntry("ch", GROUPSIGN, CellCH),
			new BrailleSymbolDataEntry("child", STANDALONE, WORDSIGN, CellCH),
			new BrailleSymbolDataEntry("gh", GROUPSIGN, CellGH),
			new BrailleSymbolDataEntry("sh", GROUPSIGN, CellSH),
			new BrailleSymbolDataEntry("shall", STANDALONE, WORDSIGN, CellSH),
			new BrailleSymbolDataEntry("th", GROUPSIGN, CellTH),
			new BrailleSymbolDataEntry("this", STANDALONE, WORDSIGN, CellTH),
			new BrailleSymbolDataEntry("wh", GROUPSIGN, CellWH),
			new BrailleSymbolDataEntry("which", STANDALONE, WORDSIGN, CellWH),
			new BrailleSymbolDataEntry("ed", GROUPSIGN, CellED),
			new BrailleSymbolDataEntry("er", GROUPSIGN, CellER),
			new BrailleSymbolDataEntry("ou", GROUPSIGN, CellOU),
			new BrailleSymbolDataEntry("out", STANDALONE, WORDSIGN, CellOU),
			new BrailleSymbolDataEntry("ow", GROUPSIGN, CellOW),
			new BrailleSymbolDataEntry("en", GROUPSIGN, CellEN),
			new BrailleSymbolDataEntry("enough", STANDALONE, WORDSIGN, CellEN),
			new BrailleSymbolDataEntry("ing", NOT_AT_START, GROUPSIGN, CellING),
			new BrailleSymbolDataEntry("ar", GROUPSIGN, CellAR),
			new BrailleSymbolDataEntry("in", GROUPSIGN, CellIN),

			new BrailleSymbolDataEntry("and", GROUPSIGN, CellAND),
			new BrailleSymbolDataEntry("for", GROUPSIGN, CellFOR),
			new BrailleSymbolDataEntry("of", GROUPSIGN, CellOF),
			new BrailleSymbolDataEntry("the", GROUPSIGN, CellTHE),
			new BrailleSymbolDataEntry("with", GROUPSIGN, CellWITH),

			new BrailleSymbolDataEntry("dis", FIRST_SYLLABLE, GROUPSIGN, CellFullstop),
			new BrailleSymbolDataEntry("his", STANDALONE, WORDSIGN, CellQuestionmark),
			new BrailleSymbolDataEntry("ff", SURROUNDED, GROUPSIGN, CellExclamationmark),
			new BrailleSymbolDataEntry("ea", SURROUNDED, GROUPSIGN, CellComma),
			new BrailleSymbolDataEntry("con", FIRST_SYLLABLE, GROUPSIGN, CellColon),
			new BrailleSymbolDataEntry("cc", SURROUNDED, GROUPSIGN, CellColon),
			new BrailleSymbolDataEntry("bb", SURROUNDED, GROUPSIGN, CellSemicolon),
			new BrailleSymbolDataEntry("be", FIRST_SYLLABLE, GROUPSIGN, CellSemicolon),
			new BrailleSymbolDataEntry("was", STANDALONE, WORDSIGN, CellCloseQuote),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots5, INVISIBLE, Cell5),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots45, INVISIBLE, Cell45),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots456, INVISIBLE, Cell456),

			new BrailleSymbolDataEntry("upon", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, Cell45, CellU),
			new BrailleSymbolDataEntry("these", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, Cell45, CellTHE),
			new BrailleSymbolDataEntry("those", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, Cell45, CellTH),
			new BrailleSymbolDataEntry("whose", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, Cell45, CellWH),
			new BrailleSymbolDataEntry("word", INITIALLETTERCONTRACTION, Cell45, CellW),

			new BrailleSymbolDataEntry("cannot", INITIALLETTERCONTRACTION, Cell456, CellC),
			new BrailleSymbolDataEntry("had", SHORT_A, INITIALLETTERCONTRACTION, Cell456, CellH),
			new BrailleSymbolDataEntry("many", INITIALLETTERCONTRACTION, Cell456, CellM),
			new BrailleSymbolDataEntry("spirit", INITIALLETTERCONTRACTION, Cell456, CellS),
			new BrailleSymbolDataEntry("their", INITIALLETTERCONTRACTION, Cell456, CellTHE),
			new BrailleSymbolDataEntry("world", INITIALLETTERCONTRACTION, Cell456, CellW),

			new BrailleSymbolDataEntry("day", INITIALLETTERCONTRACTION, Cell5, CellD),
			new BrailleSymbolDataEntry("ever", STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E, INITIALLETTERCONTRACTION, Cell5, CellE),
			new BrailleSymbolDataEntry("father", INITIALLETTERCONTRACTION, Cell5, CellF),
			new BrailleSymbolDataEntry("here", ONE_SYLLABLE, INITIALLETTERCONTRACTION, Cell5, CellH),
			new BrailleSymbolDataEntry("know", INITIALLETTERCONTRACTION, Cell5, CellK),
			new BrailleSymbolDataEntry("lord", INITIALLETTERCONTRACTION, Cell5, CellL),
			new BrailleSymbolDataEntry("mother", INITIALLETTERCONTRACTION, Cell5, CellM),
			new BrailleSymbolDataEntry("name", ONE_SYLLABLE, INITIALLETTERCONTRACTION, Cell5, CellN),
			new BrailleSymbolDataEntry("one", ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O, INITIALLETTERCONTRACTION, Cell5, CellO),
			new BrailleSymbolDataEntry("part", INITIALLETTERCONTRACTION, Cell5, CellP),
			new BrailleSymbolDataEntry("question", INITIALLETTERCONTRACTION, Cell5, CellQ),
			new BrailleSymbolDataEntry("right", INITIALLETTERCONTRACTION, Cell5, CellR),
			new BrailleSymbolDataEntry("some", ONE_SYLLABLE, INITIALLETTERCONTRACTION, Cell5, CellS),
			new BrailleSymbolDataEntry("time", ORIGINAL_PRONOUNCIATION_RETAINED, INITIALLETTERCONTRACTION, Cell5, CellT),
			new BrailleSymbolDataEntry("under", NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX, INITIALLETTERCONTRACTION, Cell5, CellU),
			new BrailleSymbolDataEntry("young", INITIALLETTERCONTRACTION, Cell5, CellY),
			new BrailleSymbolDataEntry("there", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, Cell5, CellTHE),
			new BrailleSymbolDataEntry("character", INITIALLETTERCONTRACTION, Cell5, CellCH),
			new BrailleSymbolDataEntry("through", INITIALLETTERCONTRACTION, Cell5, CellTH),
			new BrailleSymbolDataEntry("where", INITIALLETTERCONTRACTION, Cell5, CellWH),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots46, INVISIBLE, Cell46),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots56, INVISIBLE, Cell56),

			new BrailleSymbolDataEntry("ound", NOT_AT_START, FINALLETTERCONTRACTION, Cell46, CellD),
			new BrailleSymbolDataEntry("ance", NOT_AT_START, FINALLETTERCONTRACTION, Cell46, CellE),
			new BrailleSymbolDataEntry("sion", NOT_AT_START, FINALLETTERCONTRACTION, Cell46, CellN),
			new BrailleSymbolDataEntry("less", NOT_AT_START, FINALLETTERCONTRACTION, Cell46, CellS),
			new BrailleSymbolDataEntry("ount", NOT_AT_START, FINALLETTERCONTRACTION, Cell46, CellT),

			new BrailleSymbolDataEntry("ence", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellE),
			new BrailleSymbolDataEntry("ong", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellG),
			new BrailleSymbolDataEntry("ful", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellL),
			new BrailleSymbolDataEntry("tion", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellN),
			new BrailleSymbolDataEntry("ness", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellS),
			new BrailleSymbolDataEntry("ment", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellT),
			new BrailleSymbolDataEntry("ity", NOT_AT_START, FINALLETTERCONTRACTION, Cell56, CellY),

			new BrailleSymbolDataEntry("about", STANDALONE, SHORTFORM, CellA, CellB),
			new BrailleSymbolDataEntry("above", STANDALONE, SHORTFORM, CellA, CellB, CellV),
			new BrailleSymbolDataEntry("according", STANDALONE, SHORTFORM, CellA, CellC),
			new BrailleSymbolDataEntry("across", STANDALONE, SHORTFORM, CellA, CellC, CellR),
			new BrailleSymbolDataEntry("after", STANDALONE, SHORTFORM, CellA, CellF),
			new BrailleSymbolDataEntry("afternoon", STANDALONE, SHORTFORM, CellA, CellF, CellN),
			new BrailleSymbolDataEntry("afterward", STANDALONE, SHORTFORM, CellA, CellF, CellW),
			new BrailleSymbolDataEntry("again", STANDALONE, SHORTFORM, CellA, CellG),
			new BrailleSymbolDataEntry("against", STANDALONE, SHORTFORM, CellA, CellG, CellST),
			new BrailleSymbolDataEntry("also", STANDALONE, SHORTFORM, CellA, CellL),
			new BrailleSymbolDataEntry("almost", STANDALONE, SHORTFORM, CellA, CellL, CellM),
			new BrailleSymbolDataEntry("already", STANDALONE, SHORTFORM, CellA, CellL, CellR),
			new BrailleSymbolDataEntry("altogether", STANDALONE, SHORTFORM, CellA, CellL, CellT),
			new BrailleSymbolDataEntry("although", STANDALONE, SHORTFORM, CellA, CellL, CellTH),
			new BrailleSymbolDataEntry("always", STANDALONE, SHORTFORM, CellA, CellL, CellW),
			new BrailleSymbolDataEntry("blind", STANDALONE, SHORTFORM, CellB, CellL),
			new BrailleSymbolDataEntry("braille", STANDALONE, SHORTFORM, CellB, CellR, CellL),
			new BrailleSymbolDataEntry("could", STANDALONE, SHORTFORM, CellC, CellD),
			new BrailleSymbolDataEntry("declare", STANDALONE, SHORTFORM, CellD, CellC, CellL),
			new BrailleSymbolDataEntry("declaring", STANDALONE, SHORTFORM, CellD, CellC, CellL, CellG),
			new BrailleSymbolDataEntry("deceive", STANDALONE, SHORTFORM, CellD, CellC, CellV),
			new BrailleSymbolDataEntry("deceiving", STANDALONE, SHORTFORM, CellD, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("either", STANDALONE, SHORTFORM, CellE, CellI),
			new BrailleSymbolDataEntry("friend", STANDALONE, SHORTFORM, CellF, CellR),
			new BrailleSymbolDataEntry("first", STANDALONE, SHORTFORM, CellF, CellST),
			new BrailleSymbolDataEntry("good", STANDALONE, SHORTFORM, CellG, CellD),
			new BrailleSymbolDataEntry("great", STANDALONE, SHORTFORM, CellG, CellR, CellT),
			new BrailleSymbolDataEntry("him", STANDALONE, SHORTFORM, CellH, CellM),
			new BrailleSymbolDataEntry("himself", STANDALONE, SHORTFORM, CellH, CellM, CellF),
			new BrailleSymbolDataEntry("herself", STANDALONE, SHORTFORM, CellH, CellER, CellF),
			new BrailleSymbolDataEntry("immediate", STANDALONE, SHORTFORM, CellI, CellM, CellM),
			new BrailleSymbolDataEntry("little", STANDALONE, SHORTFORM, CellL, CellL),
			new BrailleSymbolDataEntry("letter", STANDALONE, SHORTFORM, CellL, CellR),
			new BrailleSymbolDataEntry("myself", STANDALONE, SHORTFORM, CellM, CellY, CellF),
			new BrailleSymbolDataEntry("much", STANDALONE, SHORTFORM, CellM, CellCH),
			new BrailleSymbolDataEntry("must", STANDALONE, SHORTFORM, CellM, CellST),
			new BrailleSymbolDataEntry("necessary", STANDALONE, SHORTFORM, CellN, CellE, CellC),
			new BrailleSymbolDataEntry("neither", STANDALONE, SHORTFORM, CellN, CellE, CellI),
			new BrailleSymbolDataEntry("paid", STANDALONE, SHORTFORM, CellP, CellD),
			new BrailleSymbolDataEntry("perceive", STANDALONE, SHORTFORM, CellP, CellER, CellC, CellV),
			new BrailleSymbolDataEntry("perceiving", STANDALONE, SHORTFORM, CellP, CellER, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("perhaps", STANDALONE, SHORTFORM, CellP, CellER, CellH),
			new BrailleSymbolDataEntry("quick", STANDALONE, SHORTFORM, CellQ, CellK),
			new BrailleSymbolDataEntry("receive", STANDALONE, SHORTFORM, CellR, CellC, CellV),
			new BrailleSymbolDataEntry("receiving", STANDALONE, SHORTFORM, CellR, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("rejoice", STANDALONE, SHORTFORM, CellR, CellJ, CellC),
			new BrailleSymbolDataEntry("rejoicing", STANDALONE, SHORTFORM, CellR, CellJ, CellC, CellG),
			new BrailleSymbolDataEntry("said", STANDALONE, SHORTFORM, CellS, CellD),
			new BrailleSymbolDataEntry("such", STANDALONE, SHORTFORM, CellS, CellCH),
			new BrailleSymbolDataEntry("today", STANDALONE, SHORTFORM, CellT, CellD),
			new BrailleSymbolDataEntry("together", STANDALONE, SHORTFORM, CellT, CellG, CellR),
			new BrailleSymbolDataEntry("tomorrow", STANDALONE, SHORTFORM, CellT, CellM),
			new BrailleSymbolDataEntry("tonight", STANDALONE, SHORTFORM, CellT, CellN),
			new BrailleSymbolDataEntry("itself", STANDALONE, SHORTFORM, CellX, CellF),
			new BrailleSymbolDataEntry("its", STANDALONE, SHORTFORM, CellX, CellS),
			new BrailleSymbolDataEntry("your", STANDALONE, SHORTFORM, CellY, CellR),
			new BrailleSymbolDataEntry("yourself", STANDALONE, SHORTFORM, CellY, CellR, CellF),
			new BrailleSymbolDataEntry("yourselves", STANDALONE, SHORTFORM, CellY, CellR, CellV, CellS),
			new BrailleSymbolDataEntry("themselves", STANDALONE, SHORTFORM, CellTHE, CellM, CellV, CellS),
			new BrailleSymbolDataEntry("children", STANDALONE, SHORTFORM, CellCH, CellN),
			new BrailleSymbolDataEntry("should", STANDALONE, SHORTFORM, CellSH, CellD),
			new BrailleSymbolDataEntry("thyself", STANDALONE, SHORTFORM, CellTH, CellY, CellF),
			new BrailleSymbolDataEntry("ourselves", STANDALONE, SHORTFORM, CellOU, CellR, CellV, CellS),
			new BrailleSymbolDataEntry("would", STANDALONE, SHORTFORM, CellW, CellD),
			new BrailleSymbolDataEntry("because", STANDALONE, SHORTFORM, CellSemicolon, CellC),
			new BrailleSymbolDataEntry("before", STANDALONE, SHORTFORM, CellSemicolon, CellF),
			new BrailleSymbolDataEntry("behind", STANDALONE, SHORTFORM, CellSemicolon, CellH),
			new BrailleSymbolDataEntry("below", STANDALONE, SHORTFORM, CellSemicolon, CellL),
			new BrailleSymbolDataEntry("beneath", STANDALONE, SHORTFORM, CellSemicolon, CellN),
			new BrailleSymbolDataEntry("beside", STANDALONE, SHORTFORM, CellSemicolon, CellS),
			new BrailleSymbolDataEntry("between", STANDALONE, SHORTFORM, CellSemicolon, CellT),
			new BrailleSymbolDataEntry("beyond", STANDALONE, SHORTFORM, CellSemicolon, CellY),
			new BrailleSymbolDataEntry("conceive", STANDALONE, SHORTFORM, CellColon, CellC, CellV),
			new BrailleSymbolDataEntry("conceiving", STANDALONE, SHORTFORM, CellColon, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("oneself", STANDALONE, SHORTFORM, Cell5, CellO, CellF)
	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[] {
				new DictionaryCategory(R.string.symbol_letter,0,LETTER),
				new DictionaryCategory(R.string.symbol_number,4,NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation,6,PUNCTUATION),
				new DictionaryCategory(R.string.category_contractions, 8, GROUPSIGN, WORDSIGN).setTranslateToggle(true),
				new DictionaryCategory(R.string.category_advancedcontractions, 12, INITIALLETTERCONTRACTION, FINALLETTERCONTRACTION).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_shortform, 15, SHORTFORM).setTranslateToggle(true)};
	}
}
