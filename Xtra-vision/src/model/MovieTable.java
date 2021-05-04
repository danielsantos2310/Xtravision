/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brener
 */
public class MovieTable extends AbstractTableModel{
    
    private ArrayList rows= null;
    private String[] columns= null;
    
    public MovieTable(ArrayList row, String[] col){
        
        setRows(row);
        setColumns(col);
    
    }

    /**
     * @return the rows
     */
    public ArrayList getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(ArrayList rows) {
        this.rows = rows;
    }

    /**
     * @return the columns
     */
    public String[] getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    
    //method to count the columns quantity
    public int getColumnCount(){
    
        return columns.length;      
    }
    
    //method to count the rows quantity in array
    public int getRowCount(){
        
        return rows.size();    
    }
    
    //method to take the columns name value, after taking the columns names, returns the amount of columns
    public String getColumnName(int numCol){
    
        return columns[numCol];
    }
    
    //method to mount the table
    public Object getValueAt(int numRow, int numCol){
    
        Object[] row = (Object[])getRows().get(numRow);
        return row[numCol];
    }
    
    
    
    
}
