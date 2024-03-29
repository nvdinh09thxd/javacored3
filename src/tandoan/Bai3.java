package tandoan;

import java.util.Scanner;

public class Bai3 {

	public static String docHangDonVi(int n) {
		switch (n) {
		case 0:
			return "";
		case 1:
			return "một";
		case 2:
			return "hai";
		case 3:
			return "ba";
		case 4:
			return "bốn";
		case 5:
			return "năm";
		case 6:
			return "sáu";
		case 7:
			return "bảy";
		case 8:
			return "tám";
		case 9:
			return "chín";
		}
		return "";
	}

	public static String docHangChuc(int n) {
		switch (n) {
		case 0:
			return "lẻ";
		case 1:
			return "mười";
		case 2:
			return "hai mươi";
		case 3:
			return "ba mươi";
		case 4:
			return "bốn mươi";
		case 5:
			return "năm mươi";
		case 6:
			return "sáu mươi";
		case 7:
			return "bảy mươi";
		case 8:
			return "tám mươi";
		case 9:
			return "chín mươi";
		}
		return "";
	}

	public static String docHangTram(int n) {
		switch (n) {
		case 0:
			return "";
		case 1:
			return "một trăm";
		case 2:
			return "hai trăm";
		case 3:
			return "ba trăm";
		case 4:
			return "bốn trăm";
		case 5:
			return "năm trăm";
		case 6:
			return "sáu trăm";
		case 7:
			return "bảy trăm";
		case 8:
			return "tám trăm";
		case 9:
			return "chín trăm";
		}
		return "";
	}

	public static String readNumber(int n) {
		if (n == 0) {
			return "Không";
		}

		int du;

		String s1 = "", s2 = "", s3 = "";
		int dem = 0;
		while (n != 0) {
			du = n % 10;
			if (dem == 0) {
				s1 = docHangDonVi(du);
			} else if (dem == 1) {
				s2 = docHangChuc(du);
			} else
				s3 = docHangTram(du);
			n = n / 10;
			dem++;
		}
		if (s1 == "" && s2 == "lẻ") {
			s1 = s2 = "";
		}
		if (s2 != "" && s2 != "mười" && s1 == "một" && s3 != "" && s2 != "lẻ") {
			s1 = "mốt";
		}
		if (s2 != "" && s1 == "năm" && s3 != "" && s2 != "lẻ") {
			s1 = "lăm";
		}
		return (s3 + " " + s2 + " " + s1);
	}

	public static int inputNumber(int n) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input n :");
			try {
				n = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Please input is number!!!");
//				e.printStackTrace();
			}
		} while (n < 0 || n >= 1000);
		return n;
	}

	public static void main(String[] args) {
		int n = inputNumber(-1);
		System.out.println("Số " + n + " đọc là: " + readNumber(n));
	}

}
