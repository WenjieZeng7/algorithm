import org.junit.Test;

/**
 * TLV
 * https://blog.nowcoder.net/n/0f459f23560144ec812a043b313be238
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 11:42
 */
public class HW4 {
    @Test
    public void tlv(){
        String tag = "31";
        String str = "32 01 00 AE 90 02 00 01 02 30 03 00 AB 32 31 31 02 00 32 33 33 01 00 CC";
        String[] s = str.split(" ");
        int i;
        int offset = charToInt(s[1],s[2]);
        //最后返回的i就是tag所在的index
        for (i = 0; i < s.length; i++) {
            if(s[i].equals(tag)){
                break;
            }
            i += offset+2;
            offset = charToInt(s[i+2],s[i+3]); //下一个的偏移
        }
        StringBuilder sb = new StringBuilder(offset);
        for (int j = 0; j < offset; j++) {
            sb.append(s[j+i+3]+" ");
        }
        System.out.println(sb);
    }


    private int charToInt(String s1,String s2){
        int out = 0;
        out += (s1.charAt(0)-'0')*16 + (s1.charAt(1)-'0') + (s2.charAt(0)-'0')*16*16*16 + (s2.charAt(1)-'0')*16*16;
        return out;
    }
}
