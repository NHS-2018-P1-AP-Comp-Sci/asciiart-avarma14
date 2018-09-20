/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {
	public static void main(String args []) {
		pumpkinStem ();
		System.out.println();
		System.out.println("           ______|\"\"|______    ");
		System.out.println("          /      |\"\"|      \\  ");
		System.out.println("         /    _        _    \\   ");
		System.out.println("        /    /_\\      /_\\    \\");
		System.out.println("       /           _          \\ ");
		System.out.println("       |          /_\\         | ");
		System.out.println("       |                      |  ");
		System.out.println("       \\    __   ____   __    / ");
		System.out.println("        \\   \\ |_|    |_| /   / ");
		System.out.println("         \\   \\__________/   /  ");
		System.out.println("          \\________________/    ");
		System.out.println("\n");
	
		happy ();
		halloween();

	}
	
	public static void pumpkinStem () {
		System.out.print("                 |\"\"|          ");
	}
	
	public static void letterH () {
		System.out.println(" |__| ");
		System.out.println(" |  | ");
	}
	
	public static void letterA () {
		System.out.println("  _");
		System.out.println(" /_\\");
		System.out.println("/   \\");
	}
	
	public static void letterP () {
		System.out.println("  __");
		System.out.println(" |__)");
		System.out.println(" | ");
	}
	
	public static void letterE() {
		System.out.println("  ___");
		System.out.println(" |___");
		System.out.println(" |___ ");
	}	
	
	public static void letterL() {
		System.out.println();
		System.out.println(" |");
		System.out.println(" |___ ");
	} 
	
	public static void happy () {
		letterH ();
		letterA ();
		letterP ();
		letterP ();
		System.out.println();
		System.out.println(" \\_/");
		System.out.println("  |");
	}
	
	public static void halloween () {
		System.out.println("\n");
		letterH();
		letterA ();
		letterL ();
		letterL ();
		System.out.println("  ___ ");
		System.out.println(" /   \\");
		System.out.println(" \\___/ \n");
		System.out.println(" \\    /");
		System.out.println("  \\/\\/");
		letterE();
		letterE();
		System.out.println(" \n |\\ |");
		System.out.println(" | \\|");
	}
	
}
















