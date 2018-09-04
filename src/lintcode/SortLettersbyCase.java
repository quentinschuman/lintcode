/**
* @project_name GitHub
* @author quent
* @date 2018年8月30日
* @time 上午8:28:48
*/
package lintcode;

/**
 * @author quent
 *
 */
public class SortLettersbyCase {

	public void sortLetters(char[] chars) {
        if (chars==null||chars.length==0) {
			return;
		}
        int i=0,j=chars.length-1;
        while(i<j) {
        	while(i<j&&chars[i]>='a'&&chars[i]<='z') {
        		i++;
        	}
        	while(i<j&&chars[j]>='A'&&chars[j]<='Z') {
        		j--;
        	}
        	if (i<j) {
				char tmp=chars[i];
				chars[i]=chars[j];
				chars[j]=tmp;
			}
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortLettersbyCase sortLettersbyCase = new SortLettersbyCase();
		char[] chars= {'a','b','A','c','D'};
		sortLettersbyCase.sortLetters(chars);
		System.out.println(chars);
	}

}
