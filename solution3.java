
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS
{
    private Queue<Data> queue;
    static class Data
    {
        int count;
        int x,y;
        Data()
        {
            this.count=0;

        }
        Data(int X, int Y, int Count)
        {
            this.x = X;
            this.y = Y;
            this.count = Count;
        }
    }

    public void knightMoves(int xStart, int yStart, int xEnd, int yEnd)
    {
        int xMove[] = {2, 1, -1, -2, -2, -1,  1,  2 };
        int yMove[] = {1, 2,  2,  1, -1, -2, -2, -1 };
        int[][] board = new int[8][8];
        for(int i =0;i<8;i++)
            for(int j =0;j<8;j++)
                board[i][j] = 0;
        board[xStart][yStart] = 1;
        Data start = new Data(xStart,yStart,0);
        this.queue.add(start);
        while (!queue.isEmpty())
        {
            Data temp = queue.peek();
            this.queue.remove();
            for (int i = 0;i<8;i++)
            {
                int nextX = xStart + xMove[i];
                int nextY = yStart + yMove[i];
                if ( nextX >= 0 && nextX <= 7 && nextY >= 0 && nextY <= 7 && board[nextX][nextY] != 1)
                {
                    Data next = new Data(nextX,nextY,temp.count + 1);
                    this.queue.add(next);
                    board[nextX][nextY] = 1;
                    if(nextX == xEnd && nextY == yEnd)
                    {
                        System.out.print(temp.count + 1);
                    }
                }
            }
        }
    }

    public static void main(String arg[])
    {
        BFS board = new BFS();
        board.knightMoves(1,1,7,7);

    }
}