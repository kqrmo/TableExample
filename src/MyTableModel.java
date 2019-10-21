
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author margus-matis.roo
 */
public class MyTableModel extends DefaultTableModel {

    String[] header;
    List<String[]> data = new ArrayList<>();

    public MyTableModel(String[] header, List<String[]> data) {
        this.header = header;
        this.data = data;
        //Päis paika
        for (String head : header) {
        addColumn(head);
    }
        for(int i = 0; i < data.size(); i++) {
            addRow(data.get(i));
        }
                
    }

    @Override
    public Object getValueAt(int row, int column) {
        return super.getValueAt(row, column); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return super.getRowCount(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
