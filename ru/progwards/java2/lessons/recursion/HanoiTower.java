package ru.progwards.java2.lessons.recursion;

public class HanoiTower {

	private int tower[][];
	private int lines = 3;
	private int size;
	private int pos;
	private boolean on = true;
	
	public HanoiTower (int size, int pos)
	{
		this.size = size;
		this.pos = pos;
		tower = new int[this.lines][this.size];
		
		for (int i = 0; i < this.lines; i++)
		{
			for (int j = 0; j < size; j++)
			{
				int token  = (i == pos)? (j + 1) : 0;
				this.tower[i][j] = token;
			}
		}
	}
	
	public void print()
	{
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.lines; j++) {
				if(this.tower[j][i] == 0) {
					System.out.print("  I  ");
				} else {
					System.out.printf("<%03d>", this.tower[j][i]); 
				}
			}	
			System.out.print("\n");
		}
		System.out.printf(String.format("%17s\n\n", "").replace(' ', '='));
	}

	public void  move(int from, int to)
	{
		moveTower(from, to, this.getWith(from, to), this.size);
	}
	
	private int getWith(int from, int to)
	{
		System.out.println(this.lines - from - to);
		return this.lines - from - to;
	}
	
	private void moveTower(int from, int to, int with, int height)
	{
		if(height == 1) {
			this.tower[to][height-1] = this.tower[from][height-1];
			this.tower[from][height-1] = 0;
			return;
		}
		if(height > 1) {
			this.moveTower(from, with, to, height - 1);
			this.setTrace(this.on);
			this.tower[to][height -1] = this.tower[from][height -1];
			this.tower[from][height -1 ] = 0;
			this.setTrace(this.on);
			this.moveTower(with, to, from, height - 1);
			this.setTrace(this.on);
		}

		return;
	}
	
	public void setTrace(boolean on)
	{
		if(on) {
			this.print();
		}
		return;
	}
}
