// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: dejavu.flex

package dejavu.psi;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dejavu.psi.DejavuTypes.*;


public class _DejavuLexer implements com.intellij.lexer.FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int ProgramContext = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\1\u1f00\11\u2000\1\u2100\1\u2200\2\u2000\1\u2300"+
    "\1\u2400\2\u2000\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u2000\1\u0100\1\u3000\1\u3100\1\u3200\1\u3300"+
    "\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00\1\u3b00"+
    "\1\u0100\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100\1\u4200"+
    "\1\u2000\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u2000\1\u4f00\1\u5000"+
    "\1\u5100\1\u2000\3\u0100\1\u5200\1\u5300\1\u5400\12\u2000\4\u0100"+
    "\1\u5500\17\u2000\2\u0100\1\u5600\41\u2000\2\u0100\1\u5700\1\u5800"+
    "\2\u2000\1\u5900\1\u5a00\27\u0100\1\u5b00\2\u0100\1\u5c00\45\u2000"+
    "\1\u0100\1\u5d00\1\u5e00\11\u2000\1\u5f00\24\u2000\1\u6000\1\u6100"+
    "\1\u2000\1\u6200\1\u6300\1\u6400\1\u6500\2\u2000\1\u6600\5\u2000"+
    "\1\u6700\1\u6800\1\u6900\5\u2000\1\u6a00\1\u6b00\4\u2000\1\u6c00"+
    "\21\u2000\246\u0100\1\u6d00\20\u0100\1\u6e00\1\u6f00\25\u0100\1\u7000"+
    "\34\u0100\1\u7100\14\u2000\2\u0100\1\u7200\u0b06\u2000\1\u7300\u02fe\u2000";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\0\1\5\1\6\1\0\1\7\1\10\1\11"+
    "\1\12\1\0\1\13\1\14\1\15\1\16\12\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\32\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\27\1\37"+
    "\1\40\1\41\1\42\1\27\1\43\1\44\1\27\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\27\1\53\1\54"+
    "\1\55\1\27\1\56\1\57\1\60\2\27\1\61\1\62"+
    "\1\63\1\64\6\0\1\3\32\0\1\1\11\0\1\27"+
    "\12\0\1\27\1\0\1\65\2\0\1\27\5\0\27\27"+
    "\1\0\37\27\1\0\u01ca\27\4\0\14\27\16\0\5\27"+
    "\7\0\1\27\1\0\1\27\21\0\160\65\5\27\1\0"+
    "\2\27\3\0\3\27\1\0\1\27\6\0\1\27\1\65"+
    "\3\27\1\0\1\27\1\0\24\27\1\0\123\27\1\0"+
    "\213\27\1\0\5\65\2\0\246\27\1\0\46\27\2\0"+
    "\1\27\6\0\51\27\10\0\55\65\1\0\1\65\1\0"+
    "\2\65\1\0\2\65\1\0\1\65\10\0\33\27\4\0"+
    "\4\27\35\0\13\65\5\0\53\27\37\65\4\0\2\27"+
    "\1\65\143\27\1\0\1\27\7\65\2\0\6\65\2\27"+
    "\2\65\1\0\4\65\2\27\12\65\3\27\2\0\1\27"+
    "\20\0\1\27\1\65\36\27\33\65\2\0\131\27\13\65"+
    "\1\27\16\0\12\65\41\27\11\65\2\27\4\0\1\27"+
    "\2\0\1\65\2\0\26\27\4\65\1\27\11\65\1\27"+
    "\3\65\1\27\5\65\22\0\31\27\3\65\4\0\13\27"+
    "\65\0\25\27\1\0\10\27\25\0\17\65\1\0\41\65"+
    "\66\27\3\65\1\27\22\65\1\27\7\65\12\27\2\65"+
    "\2\0\12\65\1\0\20\27\3\65\1\0\10\27\2\0"+
    "\2\27\2\0\26\27\1\0\7\27\1\0\1\27\3\0"+
    "\4\27\2\0\1\65\1\27\7\65\2\0\2\65\2\0"+
    "\3\65\1\27\10\0\1\65\4\0\2\27\1\0\3\27"+
    "\2\65\2\0\12\65\2\27\12\0\1\27\1\0\1\65"+
    "\2\0\3\65\1\0\6\27\4\0\2\27\2\0\26\27"+
    "\1\0\7\27\1\0\2\27\1\0\2\27\1\0\2\27"+
    "\2\0\1\65\1\0\5\65\4\0\2\65\2\0\3\65"+
    "\3\0\1\65\7\0\4\27\1\0\1\27\7\0\14\65"+
    "\3\27\1\65\13\0\3\65\1\0\11\27\1\0\3\27"+
    "\1\0\26\27\1\0\7\27\1\0\2\27\1\0\5\27"+
    "\2\0\1\65\1\27\10\65\1\0\3\65\1\0\3\65"+
    "\2\0\1\27\17\0\2\27\2\65\2\0\12\65\11\0"+
    "\1\27\6\65\1\0\3\65\1\0\10\27\2\0\2\27"+
    "\2\0\26\27\1\0\7\27\1\0\2\27\1\0\5\27"+
    "\2\0\1\65\1\27\7\65\2\0\2\65\2\0\3\65"+
    "\10\0\2\65\4\0\2\27\1\0\3\27\2\65\2\0"+
    "\12\65\1\0\1\27\20\0\1\65\1\27\1\0\6\27"+
    "\3\0\3\27\1\0\4\27\3\0\2\27\1\0\1\27"+
    "\1\0\2\27\3\0\2\27\3\0\3\27\3\0\14\27"+
    "\4\0\5\65\3\0\3\65\1\0\4\65\2\0\1\27"+
    "\6\0\1\65\16\0\12\65\20\0\5\65\10\27\1\0"+
    "\3\27\1\0\27\27\1\0\20\27\3\0\1\27\7\65"+
    "\1\0\3\65\1\0\4\65\7\0\2\65\1\0\3\27"+
    "\5\0\2\27\2\65\2\0\12\65\20\0\1\27\3\65"+
    "\1\0\10\27\1\0\3\27\1\0\27\27\1\0\12\27"+
    "\1\0\5\27\2\0\1\65\1\27\7\65\1\0\3\65"+
    "\1\0\4\65\7\0\2\65\7\0\1\27\1\0\2\27"+
    "\2\65\2\0\12\65\1\0\2\27\15\0\4\65\1\0"+
    "\10\27\1\0\3\27\1\0\51\27\2\65\1\27\7\65"+
    "\1\0\3\65\1\0\4\65\1\27\5\0\3\27\1\65"+
    "\7\0\3\27\2\65\2\0\12\65\12\0\6\27\2\0"+
    "\2\65\1\0\22\27\3\0\30\27\1\0\11\27\1\0"+
    "\1\27\2\0\7\27\3\0\1\65\4\0\6\65\1\0"+
    "\1\65\1\0\10\65\6\0\12\65\2\0\2\65\15\0"+
    "\60\27\1\65\1\27\10\65\5\0\7\27\10\65\1\0"+
    "\12\65\47\0\2\27\1\0\1\27\1\0\5\27\1\0"+
    "\30\27\1\0\1\27\1\0\12\27\1\65\1\27\12\65"+
    "\1\27\2\0\5\27\1\0\1\27\1\0\6\65\2\0"+
    "\12\65\2\0\4\27\40\0\1\27\27\0\2\65\6\0"+
    "\12\65\13\0\1\65\1\0\1\65\1\0\1\65\4\0"+
    "\2\65\10\27\1\0\44\27\4\0\24\65\1\0\2\65"+
    "\5\27\13\65\1\0\44\65\11\0\1\65\71\0\53\27"+
    "\24\65\1\27\12\65\6\0\6\27\4\65\4\27\3\65"+
    "\1\27\3\65\2\27\7\65\3\27\4\65\15\27\14\65"+
    "\1\27\17\65\2\0\46\27\1\0\1\27\5\0\1\27"+
    "\2\0\53\27\1\0\115\27\1\0\4\27\2\0\7\27"+
    "\1\0\1\27\1\0\4\27\2\0\51\27\1\0\4\27"+
    "\2\0\41\27\1\0\4\27\2\0\7\27\1\0\1\27"+
    "\1\0\4\27\2\0\17\27\1\0\71\27\1\0\4\27"+
    "\2\0\103\27\2\0\3\65\11\0\11\65\16\0\20\27"+
    "\20\0\126\27\2\0\6\27\3\0\u016c\27\2\0\21\27"+
    "\1\1\32\27\5\0\113\27\3\0\13\27\7\0\15\27"+
    "\1\0\4\27\3\65\13\0\22\27\3\65\13\0\22\27"+
    "\2\65\14\0\15\27\1\0\3\27\1\0\2\65\14\0"+
    "\64\27\40\65\3\0\1\27\4\0\1\27\1\65\2\0"+
    "\12\65\41\0\3\65\2\0\12\65\6\0\131\27\7\0"+
    "\51\27\1\65\1\27\5\0\106\27\12\0\37\27\1\0"+
    "\14\65\4\0\14\65\12\0\12\65\36\27\2\0\5\27"+
    "\13\0\54\27\4\0\32\27\6\0\13\65\45\0\27\27"+
    "\5\65\4\0\65\27\12\65\1\0\35\65\2\0\13\65"+
    "\6\0\12\65\15\0\1\27\10\0\16\65\102\0\5\65"+
    "\57\27\21\65\7\27\4\0\12\65\21\0\11\65\14\0"+
    "\3\65\36\27\15\65\2\27\12\65\54\27\16\65\14\0"+
    "\44\27\24\65\10\0\12\65\3\0\3\27\12\65\44\27"+
    "\2\0\11\27\7\0\53\27\2\0\3\27\20\0\3\65"+
    "\1\0\25\65\4\27\1\65\6\27\1\65\2\27\3\65"+
    "\1\27\5\0\300\27\72\65\1\0\5\65\26\27\2\0"+
    "\6\27\2\0\46\27\2\0\6\27\2\0\10\27\1\0"+
    "\1\27\1\0\1\27\1\0\1\27\1\0\37\27\2\0"+
    "\65\27\1\0\7\27\1\0\1\27\3\0\3\27\1\0"+
    "\7\27\3\0\4\27\2\0\6\27\4\0\15\27\5\0"+
    "\3\27\1\0\7\27\3\0\13\1\35\0\2\3\5\0"+
    "\1\1\17\0\2\65\23\0\1\65\12\0\1\1\21\0"+
    "\1\27\15\0\1\27\20\0\15\27\63\0\15\65\4\0"+
    "\1\65\3\0\14\65\21\0\1\27\4\0\1\27\2\0"+
    "\12\27\1\0\1\27\2\0\6\27\6\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\20\27\2\0\4\27\5\0"+
    "\5\27\4\0\1\27\21\0\51\27\256\0\1\66\u01c8\0"+
    "\57\27\1\0\57\27\1\0\205\27\6\0\4\27\3\65"+
    "\2\27\14\0\46\27\1\0\1\27\5\0\1\27\2\0"+
    "\70\27\7\0\1\27\17\0\1\65\27\27\11\0\7\27"+
    "\1\0\7\27\1\0\7\27\1\0\7\27\1\0\7\27"+
    "\1\0\7\27\1\0\7\27\1\0\7\27\1\0\40\65"+
    "\1\1\4\0\3\27\31\0\11\27\6\65\1\0\5\27"+
    "\2\0\5\27\4\0\126\27\2\0\2\65\2\0\3\27"+
    "\1\0\132\27\1\0\4\27\5\0\53\27\1\0\136\27"+
    "\21\0\33\27\65\0\306\27\112\0\360\27\20\0\215\27"+
    "\103\0\56\27\2\0\15\27\3\0\20\27\12\65\2\27"+
    "\24\0\57\27\1\65\4\0\12\65\1\0\37\27\2\65"+
    "\120\27\2\65\45\0\11\27\2\0\147\27\2\0\65\27"+
    "\2\0\5\27\60\0\13\27\1\65\3\27\1\65\4\27"+
    "\1\65\27\27\5\65\30\0\64\27\14\0\2\65\62\27"+
    "\22\65\12\0\12\65\6\0\22\65\6\27\3\0\1\27"+
    "\1\0\2\27\13\65\34\27\10\65\2\0\27\27\15\65"+
    "\14\0\35\27\3\0\4\65\57\27\16\65\16\0\1\27"+
    "\12\65\6\0\5\27\1\65\12\27\12\65\5\27\1\0"+
    "\51\27\16\65\11\0\3\27\1\65\10\27\2\65\2\0"+
    "\12\65\6\0\27\27\3\0\1\27\3\65\62\27\1\65"+
    "\1\27\3\65\2\27\2\65\5\27\2\65\1\27\1\65"+
    "\1\27\30\0\3\27\2\0\13\27\5\65\2\0\3\27"+
    "\2\65\12\0\6\27\2\0\6\27\2\0\6\27\11\0"+
    "\7\27\1\0\7\27\1\0\53\27\1\0\14\27\10\0"+
    "\163\27\10\65\1\0\2\65\2\0\12\65\6\0\244\27"+
    "\14\0\27\27\4\0\61\27\4\0\u0100\67\156\27\2\0"+
    "\152\27\46\0\7\27\14\0\5\27\5\0\1\27\1\65"+
    "\12\27\1\0\15\27\1\0\5\27\1\0\1\27\1\0"+
    "\2\27\1\0\2\27\1\0\154\27\41\0\213\27\6\0"+
    "\332\27\22\0\100\27\2\0\66\27\50\0\12\27\6\0"+
    "\20\65\20\0\20\65\3\0\2\65\30\0\3\65\41\0"+
    "\1\27\1\0\1\27\3\0\1\27\1\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\176\27\23\0\12\65\7\0"+
    "\32\27\4\0\1\65\1\0\32\27\13\0\70\27\2\65"+
    "\37\27\3\0\6\27\2\0\6\27\2\0\6\27\2\0"+
    "\3\27\43\0\14\27\1\0\32\27\1\0\23\27\1\0"+
    "\2\27\1\0\17\27\2\0\16\27\42\0\173\27\105\0"+
    "\65\27\210\0\1\65\202\0\35\27\3\0\61\27\17\0"+
    "\1\65\37\0\40\27\15\0\36\27\5\0\46\27\5\65"+
    "\5\0\36\27\2\0\44\27\4\0\10\27\1\0\5\27"+
    "\52\0\236\27\2\0\12\65\6\0\44\27\4\0\44\27"+
    "\4\0\50\27\10\0\64\27\234\0\67\27\11\0\26\27"+
    "\12\0\10\27\230\0\6\27\2\0\1\27\1\0\54\27"+
    "\1\0\2\27\3\0\1\27\2\0\27\27\12\0\27\27"+
    "\11\0\37\27\101\0\23\27\1\0\2\27\12\0\26\27"+
    "\12\0\32\27\106\0\70\27\6\0\2\27\100\0\1\27"+
    "\3\65\1\0\2\65\5\0\4\65\4\27\1\0\3\27"+
    "\1\0\35\27\2\0\3\65\4\0\1\65\40\0\35\27"+
    "\3\0\35\27\43\0\10\27\1\0\34\27\2\65\31\0"+
    "\66\27\12\0\26\27\12\0\23\27\15\0\22\27\156\0"+
    "\111\27\67\0\63\27\15\0\63\27\15\0\44\27\4\65"+
    "\10\0\12\65\306\0\35\27\12\0\1\27\10\0\26\27"+
    "\13\65\217\0\27\27\11\0\3\65\65\27\17\65\37\0"+
    "\12\65\17\0\4\65\55\27\13\65\25\0\31\27\7\0"+
    "\12\65\6\0\3\65\44\27\16\65\1\0\12\65\4\0"+
    "\1\27\2\65\11\0\43\27\1\65\2\0\1\27\11\0"+
    "\3\65\60\27\16\65\4\27\4\0\4\65\3\0\12\65"+
    "\1\27\1\0\1\27\43\0\22\27\1\0\31\27\14\65"+
    "\6\0\1\65\101\0\7\27\1\0\1\27\1\0\4\27"+
    "\1\0\17\27\1\0\12\27\7\0\57\27\14\65\5\0"+
    "\12\65\6\0\4\65\1\0\10\27\2\0\2\27\2\0"+
    "\26\27\1\0\7\27\1\0\2\27\1\0\5\27\1\0"+
    "\2\65\1\27\7\65\2\0\2\65\2\0\3\65\2\0"+
    "\1\27\6\0\1\65\5\0\5\27\2\65\2\0\7\65"+
    "\3\0\5\65\213\0\65\27\22\65\4\27\5\0\12\65"+
    "\4\0\1\65\1\27\40\0\60\27\24\65\2\27\1\0"+
    "\1\27\10\0\12\65\246\0\57\27\7\65\2\0\11\65"+
    "\27\0\4\27\2\65\42\0\60\27\21\65\3\0\1\27"+
    "\13\0\12\65\46\0\53\27\15\65\1\27\7\0\12\65"+
    "\66\0\33\27\2\0\17\65\4\0\12\65\306\0\54\27"+
    "\17\65\145\0\100\27\12\65\25\0\1\27\240\0\10\27"+
    "\2\0\47\27\7\65\2\0\7\65\1\27\1\0\1\27"+
    "\1\65\33\0\1\27\12\65\50\27\7\65\1\27\4\65"+
    "\10\0\1\65\10\0\1\27\13\65\56\27\20\65\3\0"+
    "\1\27\42\0\71\27\7\0\11\27\1\0\45\27\10\65"+
    "\1\0\10\65\1\27\17\0\12\65\30\0\36\27\2\0"+
    "\26\65\1\0\16\65\111\0\7\27\1\0\2\27\1\0"+
    "\46\27\6\65\3\0\1\65\1\0\2\65\1\0\7\65"+
    "\1\27\1\65\10\0\12\65\6\0\6\27\1\0\2\27"+
    "\1\0\40\27\5\65\1\0\2\65\1\0\5\65\1\27"+
    "\7\0\12\65\u0136\0\23\27\4\65\11\0\232\27\146\0"+
    "\157\27\21\0\304\27\274\0\57\27\321\0\107\27\271\0"+
    "\71\27\7\0\37\27\1\0\12\65\146\0\36\27\2\0"+
    "\5\65\13\0\60\27\7\65\11\0\4\27\14\0\12\65"+
    "\11\0\25\27\5\0\23\27\260\0\100\27\200\0\113\27"+
    "\4\0\1\65\1\27\67\65\7\0\4\65\15\27\100\0"+
    "\2\27\1\0\1\27\34\0\370\27\10\0\363\27\15\0"+
    "\37\27\61\0\3\27\21\0\4\27\10\0\u018c\27\4\0"+
    "\153\27\5\0\15\27\3\0\11\27\7\0\12\27\3\0"+
    "\2\65\306\0\5\65\3\0\6\65\10\0\10\65\2\0"+
    "\7\65\36\0\4\65\224\0\3\65\273\0\125\27\1\0"+
    "\107\27\1\0\2\27\2\0\1\27\2\0\2\27\2\0"+
    "\4\27\1\0\14\27\1\0\1\27\1\0\7\27\1\0"+
    "\101\27\1\0\4\27\2\0\10\27\1\0\7\27\1\0"+
    "\34\27\1\0\4\27\1\0\5\27\1\0\1\27\3\0"+
    "\7\27\1\0\u0154\27\2\0\31\27\1\0\31\27\1\0"+
    "\37\27\1\0\31\27\1\0\37\27\1\0\31\27\1\0"+
    "\37\27\1\0\31\27\1\0\37\27\1\0\31\27\1\0"+
    "\10\27\2\0\151\65\4\0\62\65\10\0\1\65\16\0"+
    "\1\65\26\0\5\65\1\0\17\65\120\0\7\65\1\0"+
    "\21\65\2\0\7\65\1\0\2\65\1\0\5\65\325\0"+
    "\55\27\3\0\7\65\7\27\2\0\12\65\4\0\1\27"+
    "\u0171\0\54\27\16\65\6\0\305\27\13\0\7\65\51\0"+
    "\104\27\7\65\1\27\4\0\12\65\246\0\4\27\1\0"+
    "\33\27\1\0\2\27\1\0\1\27\2\0\1\27\1\0"+
    "\12\27\1\0\4\27\1\0\1\27\1\0\1\27\6\0"+
    "\1\27\4\0\1\27\1\0\1\27\1\0\1\27\1\0"+
    "\3\27\1\0\2\27\1\0\1\27\2\0\1\27\1\0"+
    "\1\27\1\0\1\27\1\0\1\27\1\0\1\27\1\0"+
    "\2\27\1\0\1\27\2\0\4\27\1\0\7\27\1\0"+
    "\4\27\1\0\4\27\1\0\1\27\1\0\12\27\1\0"+
    "\21\27\5\0\3\27\1\0\5\27\1\0\21\27\104\0"+
    "\327\27\51\0\65\27\13\0\336\27\2\0\u0182\27\16\0"+
    "\u0131\27\37\0\36\27\342\0\360\65\20\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29696];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\2\1\3\1\4\2\3"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\3\1\22\1\23"+
    "\1\24\1\3\1\25\1\26\1\23\1\3\11\23\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\0\1\35\1\0"+
    "\1\36\1\0\1\37\1\0\1\40\1\0\1\41\1\42"+
    "\1\0\1\43\1\44\5\23\1\45\1\23\1\46\4\23"+
    "\1\34\1\35\1\0\2\23\1\47\1\23\1\50\7\23"+
    "\1\51\1\52\1\53\5\23\1\54\1\23\1\55\5\23"+
    "\1\56\1\23\1\57\2\23\1\60\1\61\1\23\1\62"+
    "\3\23\1\63\1\23\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u0118\0\u01c0\0\u01f8\0\u0118\0\u0118\0\u0118\0\u0118\0\u0230"+
    "\0\u0118\0\u0268\0\u02a0\0\u02d8\0\u0118\0\u0118\0\u0310\0\u0118"+
    "\0\u0310\0\u0118\0\u0348\0\u0118\0\u0380\0\u0118\0\u0118\0\u03b8"+
    "\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578"+
    "\0\u05b0\0\u05e8\0\u0118\0\u0118\0\u0118\0\u0310\0\u0118\0\u0620"+
    "\0\u0188\0\u0118\0\u0658\0\u0118\0\u01f8\0\u0118\0\u01c0\0\u0118"+
    "\0\u0690\0\u06c8\0\u0118\0\u03f0\0\u0118\0\u0348\0\u0700\0\u0738"+
    "\0\u0770\0\u07a8\0\u07e0\0\u0348\0\u0818\0\u0850\0\u0888\0\u08c0"+
    "\0\u08f8\0\u0930\0\u0118\0\u0188\0\u0968\0\u09a0\0\u09d8\0\u0348"+
    "\0\u0a10\0\u0348\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60"+
    "\0\u0b98\0\u0118\0\u0348\0\u0348\0\u0bd0\0\u0c08\0\u0c40\0\u0c78"+
    "\0\u0cb0\0\u0348\0\u0ce8\0\u0348\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0348\0\u0e38\0\u0348\0\u0e70\0\u0ea8\0\u0348\0\u0348"+
    "\0\u0ee0\0\u0348\0\u0f18\0\u0f50\0\u0f88\0\u0348\0\u0fc0\0\u0348";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\16\3\1\5\45\3\1\6\3\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\33\1\44\1\45\1\33\1\46"+
    "\2\33\1\47\4\33\1\50\1\51\1\33\1\52\1\33"+
    "\1\53\1\54\1\55\1\56\1\6\1\57\1\6\22\3"+
    "\1\0\46\3\3\4\16\3\1\0\45\3\6\0\1\60"+
    "\152\0\3\7\64\0\4\61\1\62\24\61\1\63\36\61"+
    "\24\0\1\64\43\0\7\65\1\66\60\65\6\0\1\67"+
    "\15\0\1\70\55\0\1\71\3\0\1\72\70\0\1\23"+
    "\70\0\1\57\55\0\1\67\100\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\23\33\4\0\1\33\2\0\2\73"+
    "\2\0\63\73\7\0\1\67\10\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\23\33\4\0\1\33\2\0\35\74"+
    "\1\75\32\74\17\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\16\33\1\76\4\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\1\77\22\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\10\33\1\100\1\33\1\101\7\33\1\102\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\13\33"+
    "\1\103\7\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\4\33\1\104\4\33\1\105\1\106"+
    "\10\33\4\0\1\33\21\0\1\33\7\0\1\33\4\0"+
    "\1\33\1\0\1\107\22\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\10\33\1\110\12\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\3\33\1\111\17\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\5\33\1\112\15\33"+
    "\4\0\1\33\16\0\1\113\6\0\1\113\1\0\1\113"+
    "\6\0\1\113\27\0\1\113\3\0\4\61\1\114\24\61"+
    "\1\63\36\61\12\71\1\115\55\71\2\72\1\0\65\72"+
    "\17\0\1\33\7\0\1\33\4\0\1\33\1\0\16\33"+
    "\1\116\4\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\16\33\1\117\4\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\2\33"+
    "\1\120\20\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\17\33\1\121\3\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\15\33"+
    "\1\122\5\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\14\33\1\123\6\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\20\33"+
    "\1\124\2\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\17\33\1\125\3\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\13\33"+
    "\1\126\7\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\11\33\1\127\11\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\3\33"+
    "\1\130\2\33\1\131\14\33\4\0\1\33\2\0\12\71"+
    "\1\115\3\71\1\132\51\71\17\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\3\33\1\133\17\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\3\33"+
    "\1\134\17\33\4\0\1\33\21\0\1\33\7\0\1\33"+
    "\4\0\1\33\1\0\3\33\1\135\17\33\4\0\1\33"+
    "\21\0\1\33\7\0\1\33\4\0\1\33\1\0\10\33"+
    "\1\136\2\33\1\137\7\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\13\33\1\140\7\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\1\33\1\141\21\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\17\33\1\142\3\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\14\33\1\143\6\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\12\33\1\144\10\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\10\33\1\145\12\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\12\33\1\146\10\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\3\33\1\147\17\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\15\33\1\150\5\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\7\33\1\151\13\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\5\33\1\152\15\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\10\33\1\153\12\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\3\33\1\154\17\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\2\33\1\155\20\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\11\33\1\156\11\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\17\33\1\157\3\33\4\0\1\33\21\0\1\33"+
    "\7\0\1\33\4\0\1\33\1\0\3\33\1\160\17\33"+
    "\4\0\1\33\21\0\1\33\7\0\1\33\4\0\1\33"+
    "\1\0\1\161\22\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\16\33\1\162\4\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\3\33\1\163\17\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\17\33\1\164\3\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\12\33\1\165\10\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\3\33\1\166\17\33\4\0"+
    "\1\33\21\0\1\33\7\0\1\33\4\0\1\33\1\0"+
    "\17\33\1\167\3\33\4\0\1\33\21\0\1\33\7\0"+
    "\1\33\4\0\1\33\1\0\16\33\1\170\4\33\4\0"+
    "\1\33\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4088];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\3\1\1\11\2\1\1\11\2\1\4\11\1\1"+
    "\1\11\3\1\2\11\1\1\1\11\1\1\1\11\1\1"+
    "\1\11\1\1\2\11\13\1\3\11\1\1\1\11\1\1"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\1\1\11\1\0\1\11\15\1\1\11\1\1"+
    "\1\0\14\1\1\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _DejavuLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public com.intellij.psi.tree.IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return NORMAL_TEXT;
            }
          // fall through
          case 53: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 54: break;
          case 3:
            { return BAD_CHARACTER;
            }
          // fall through
          case 55: break;
          case 4:
            { return DOLLAR;
            }
          // fall through
          case 56: break;
          case 5:
            { return PARENTHESIS_L;
            }
          // fall through
          case 57: break;
          case 6:
            { return PARENTHESIS_R;
            }
          // fall through
          case 58: break;
          case 7:
            { return OP_MANY;
            }
          // fall through
          case 59: break;
          case 8:
            { return COMMA;
            }
          // fall through
          case 60: break;
          case 9:
            { return HYPHEN;
            }
          // fall through
          case 61: break;
          case 10:
            { return DOT;
            }
          // fall through
          case 62: break;
          case 11:
            { return SLASH;
            }
          // fall through
          case 63: break;
          case 12:
            { return INTEGER;
            }
          // fall through
          case 64: break;
          case 13:
            { return COLON;
            }
          // fall through
          case 65: break;
          case 14:
            { return SEMICOLON;
            }
          // fall through
          case 66: break;
          case 15:
            { return ANGLE_L;
            }
          // fall through
          case 67: break;
          case 16:
            { return EQ;
            }
          // fall through
          case 68: break;
          case 17:
            { return ANGLE_R;
            }
          // fall through
          case 69: break;
          case 18:
            { return AT;
            }
          // fall through
          case 70: break;
          case 19:
            { return SYMBOL;
            }
          // fall through
          case 71: break;
          case 20:
            { return BRACKET_L;
            }
          // fall through
          case 72: break;
          case 21:
            { return BRACKET_R;
            }
          // fall through
          case 73: break;
          case 22:
            { return OP_REMARK;
            }
          // fall through
          case 74: break;
          case 23:
            { return BRACE_L;
            }
          // fall through
          case 75: break;
          case 24:
            { return OP_OR;
            }
          // fall through
          case 76: break;
          case 25:
            { return BRACE_R;
            }
          // fall through
          case 77: break;
          case 26:
            { return OP_CONCAT;
            }
          // fall through
          case 78: break;
          case 27:
            { return PROPORTION;
            }
          // fall through
          case 79: break;
          case 28:
            { yybegin(ProgramContext);
          return TEMPLATE_L;
            }
          // fall through
          case 80: break;
          case 29:
            { return TEXT_DOUBLE;
            }
          // fall through
          case 81: break;
          case 30:
            { yybegin(YYINITIAL);
		  return TEMPLATE_R;
            }
          // fall through
          case 82: break;
          case 31:
            { return TEXT_SINGLE;
            }
          // fall through
          case 83: break;
          case 32:
            { return TO;
            }
          // fall through
          case 84: break;
          case 33:
            { return COMMENT_LINE;
            }
          // fall through
          case 85: break;
          case 34:
            { return ESCAPED;
            }
          // fall through
          case 86: break;
          case 35:
            { return SYMBOW_RAW;
            }
          // fall through
          case 87: break;
          case 36:
            { return KW_AS;
            }
          // fall through
          case 88: break;
          case 37:
            { return KW_IF;
            }
          // fall through
          case 89: break;
          case 38:
            { return KW_IN;
            }
          // fall through
          case 90: break;
          case 39:
            { return KW_END;
            }
          // fall through
          case 91: break;
          case 40:
            { return KW_FOR;
            }
          // fall through
          case 92: break;
          case 41:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 93: break;
          case 42:
            { return KW_CASE;
            }
          // fall through
          case 94: break;
          case 43:
            { return KW_ELSE;
            }
          // fall through
          case 95: break;
          case 44:
            { return KW_SLOT;
            }
          // fall through
          case 96: break;
          case 45:
            { return KW_WHEN;
            }
          // fall through
          case 97: break;
          case 46:
            { return KW_MATCH;
            }
          // fall through
          case 98: break;
          case 47:
            { return KW_WHILE;
            }
          // fall through
          case 99: break;
          case 48:
            { return KW_IMPORT;
            }
          // fall through
          case 100: break;
          case 49:
            { return KW_INVOKE;
            }
          // fall through
          case 101: break;
          case 50:
            { return KW_EXTENDS;
            }
          // fall through
          case 102: break;
          case 51:
            { return KW_TEMPLATE;
            }
          // fall through
          case 103: break;
          case 52:
            { return KW_IMPLEMENTS;
            }
          // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
