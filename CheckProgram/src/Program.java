import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Check[] checkArr = new Check[2];
		Check checkPtr = new Check("1212e", "National", 902, 1025.2f);
		searchCheck(checkArr,checkPtr);
	}
	public static void searchCheck(Check[] checkArr, Check checkPtr){
		creatCheckArr(checkArr);
		boolean found = false;
		for (int i = 0; i < checkArr.length; i++) {
			if (checkPtr.getChNumber().equals(checkArr[i].getChNumber())) {
				found = true;
				System.out.println(checkArr[i].toString());
			}
		}
			if (!found) {
				System.out.println("Check not exist");
			}

	}
	public static Check[] creatCheckArr (Check[] checkArr){
		String chNumber, bName;
		int depNumber;
		float aMount;
		for (int i = 0; i < checkArr.length; i++) {
			System.out.println("Enter details for Check |" + (i+1) + "|");
			System.out.print("Check number: ");
			chNumber = s.next();
			System.out.print("Bank's name: ");
			bName = s.next();
			System.out.print("Branch number: ");
			depNumber = s.nextInt();
			System.out.print("Check amount: ");
			aMount = s.nextFloat();

			checkArr[i] = new Check(chNumber, bName, depNumber, aMount);
		}
		return checkArr;
	}
	public static Scanner s =new Scanner(System.in);
}
