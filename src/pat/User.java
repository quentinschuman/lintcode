/**
* @project_name coding
* @author quent
* @date 2018年10月23日
* @time 下午8:31:01
*/
package pat;

/**
 * @author quent
 *
 */
public class User {

	private String givenName;
	private String familyName;
	public User(String givenName,String familyName) {
		this.givenName=givenName;
		this.familyName=familyName;
	}
	@Override
	public boolean equals(Object o) {
		if (this==o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		User user=(User)o;
		return givenName==user.givenName && familyName==user.familyName;
	}
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		String givenName="givenname";
//		String familyName="familyname";
//		User user=new User(givenName, familyName);
//		System.out.println(user.equals(o));
//	}

}
