package concurs;

/**
 * Created by IntelliJ IDEA.
 * User: grigo
 * Date: Nov 25, 2008
 * Time: 3:33:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcursExceptie extends Exception{
   
	private static final long serialVersionUID = 1L;
	public ConcursExceptie(){}
    public ConcursExceptie(String msg){
        super(msg);
    }
}
