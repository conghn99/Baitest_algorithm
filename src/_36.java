public class _36 {
    public boolean isValidSudoku(char[][] board) {
        int number;
        for(int row = 0; row < board.length; row++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];

            for(int col = 0; col < board[0].length; col++){

                // kiểm tra dòng
                if(board[row][col] != '.'){
                    number = board[row][col]-'1'; // - '1' để đổi kiểu dữ liệu char sang int
                    if(rowCheck[number]) //nếu giá trị đã tồn tại trong dòng
                        return false;
                    else { //nếu giá trị chưa tồn tại trong dòng
                        rowCheck[number] = true;
                    }
                }

                // kiểm tra cột
                if(board[col][row] != '.'){
                    number = board[col][row]-'1';
                    if(colCheck[number])
                        return false;
                    else {
                        colCheck[number] = true;
                    }
                }

                // kiểm tra bảng
                int rowBox = row / 3*3 + col/3;
                int colBox = row % 3*3 + col%3;
                if(board[rowBox][colBox] != '.') {
                    number = board[rowBox][colBox]-'1';
                    if(boxCheck[number])
                        return false;
                    else {
                        boxCheck[number] = true;
                    }
                }
            }
        }
        return true;
    }
}
