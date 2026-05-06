package hw.ch12;

public class NumberedBorder extends Border{
    public NumberedBorder(Display display){
        super(display);
    }

    @Override
    public int getColumns(){
        return display.getColumns()+4;
    }

    @Override 
    public int getRows(){
        return display.getRows();
    }

    @Override
    public String getRowText(int row){
        return String.format("%2d| %s", row+1, display.getRowText(row));
    }
    
}
