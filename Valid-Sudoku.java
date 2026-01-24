1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3         Set<Character>[] rows = new HashSet[9];
4        Set<Character>[] cols = new HashSet[9];
5        Set<Character>[] squares = new HashSet[9];
6
7        // Initialize the sets
8        for (int i = 0; i < 9; i++) {
9            rows[i] = new HashSet<>();
10            cols[i] = new HashSet<>();
11            squares[i] = new HashSet<>();
12        }
13
14        for (int r = 0; r < 9; r++) {
15            for (int c = 0; c < 9; c++) {
16                char currentVal = board[r][c];
17
18                if (currentVal == '.') {
19                    continue; // Skip empty cells
20                }
21
22                // Calculate the index for the 3x3 sub-box (0-8)
23                int squareIndex = (r / 3) * 3 + (c / 3);
24
25                // Check if the number is already in the current row, column, or sub-box
26                if (rows[r].contains(currentVal) || 
27                    cols[c].contains(currentVal) || 
28                    squares[squareIndex].contains(currentVal)) {
29                    return false; // Duplicate found, board is invalid
30                }
31
32                // If no duplicate, add the digit to all three sets
33                rows[r].add(currentVal);
34                cols[c].add(currentVal);
35                squares[squareIndex].add(currentVal);
36            }
37        }
38
39        return true; // No violations found after checking the entire board
40    }
41}