package Sort_Search;

import java.util.Scanner;

public class Sap_sep_hoc_sinh_den_muon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Đọc đầu vào
		int N = scanner.nextInt();
		int Q = scanner.nextInt();

		int[] heights = new int[N];
		for (int i = 0; i < N; i++) {
			heights[i] = scanner.nextInt();
		}

		// Xử lý từng học sinh đến trễ
		for (int i = 0; i < Q; i++) {
			int newHeight = scanner.nextInt();
			int position = findInsertPosition(heights, newHeight);
			System.out.println(position + 1); // Chuyển đổi từ 0-based index sang 1-based index
		}

		scanner.close();
	}

	// Hàm tìm vị trí chèn sử dụng tìm kiếm nhị phân
	private static int findInsertPosition(int[] heights, int newHeight) {
		int left = 0;
		int right = heights.length;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (heights[mid] < newHeight) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return left;
	}
}
