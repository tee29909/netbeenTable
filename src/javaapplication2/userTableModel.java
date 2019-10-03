/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class userTableModel extends AbstractTableModel{
    String[] columnNames = {"id","username","name","surname"};
    ArrayList<user> userList = data.userList;
    public userTableModel(){
    }
        

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
       return userList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        user User = userList.get(rowIndex);
        if (User == null) {
            return  "";
        }
        switch(columnIndex){
            case 0: return User.getId();
            case 1: return User.getLogin();
            case 2: return User.getName();
            case 3: return User.getSername();
            
        }
        return "";
            
    }
    
}
