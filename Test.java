/**
 * 
 */
package ue1;

/**
 * @author Antonio
 *
 */
public class Test {
	
	public static void main (String args [] ){
		
		Beverage beverage = new HouseBlend();
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + " = $ " + beverage.cost());
		
	}
	

}
