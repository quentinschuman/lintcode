/**
* @project_name GitHub
* @author quent
* @date 2018年9月10日
* @time 上午8:18:10
*/
package lintcode;

/**
 * @author quent
 *
 */
public class ReverseWordsinaString {

	public String reverseWords(String s) {
        String[] str=s.split(" ");
        String[] result=new String[str.length];
        StringBuffer sb=new StringBuffer();
        if (s==null||str.length==1) {
			return s;
		}
        int j=str.length-1;
        while(j>=0) {
        	for(int i=0;i<str.length;i++) {
            	result[i]=str[j];
            	j--;
            }
        }
        for(int k=0;k<result.length;k++) {
        	sb.append(result[k]+" ");
        }
        return sb.toString().replaceAll(" {2,}", " ");
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseWordsinaString reverseWordsinaString = new ReverseWordsinaString();
		String s = "I love to walk around in bookstores       not because I can buy all the books";
		System.out.println(reverseWordsinaString.reverseWords(s));
	}

}
