package com.sanjan.algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by sanja on 2/10/2017.
 */
public class BankRecords extends Client {

    // create objects for processing & handling
    //we create an object for the BankReocrds class and an ArrayList for handling the data
    private static BankRecords[] rObjs;
    private static List<List<String>> array = new ArrayList<>();
    /*
     * instance fields
     * all the private variables are declared
     */
    private String id;
    private int age;
    private String sex;
    private String region;
    private double income;
    private boolean married;
    private int children;
    private boolean car;
    private boolean save_act;
    private boolean current_act;
    private boolean mortgage;
    private boolean pep;

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BankRecords br = new BankRecords();
        br.read();
    }
    /*
     * (non-Javadoc)
     * @see Client#read()
     * the read method helps us to read the data from a file and then split it and add
     * then add it to an arraylist.
     * After that we process the data
     */
    public void read() throws IOException{
        // TODO Auto-generated method stub
        String line = " ";

        //try with resources statement
        //we use bufferedreader and then filereader to read the csv file which has our data
        try(BufferedReader br = new BufferedReader (new FileReader("bank-Detail.csv")))
        {

            while((line=br.readLine()) != null)
            {

                array.add(Arrays.asList(line.split(",")));

            }
        }
        catch (FileNotFoundException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally {
            process();
        }
    }
    /*
     * (non-Javadoc)
     * @see Client#process()
     * We get the data to be displayed and process it as per what we want to display
     * Here the data to be printed is kept ready so that the user can get wotever data they want.
     */
    public void process() {
        // TODO Auto-generated method stub
        // add data values from arraylist into my array
        int index = 0;
        try
        {
            rObjs = new BankRecords[array.size()];
            for(List<String> rowData: array)
            {
                rObjs[index] = new BankRecords();
                rObjs[index].setId(rowData.get(0));
                rObjs[index].setAge(Integer.parseInt(rowData.get(1)));
                rObjs[index].setSex(rowData.get(2));
                rObjs[index].setRegion(rowData.get(3));
                rObjs[index].setIncome(Double.parseDouble(rowData.get(4)));
                rObjs[index].setMarried(rowData.get(5).equalsIgnoreCase("Yes") ? true : false);
                rObjs[index].setChildren(Integer.parseInt(rowData.get(6)));
                rObjs[index].setCar(rowData.get(7).equalsIgnoreCase("Yes") ? true : false);
                rObjs[index].setSave_act(rowData.get(8).equalsIgnoreCase("Yes") ? true : false);
                rObjs[index].setCurrent_act(rowData.get(9).equalsIgnoreCase("Yes") ? true : false);
                rObjs[index].setMortgage(rowData.get(10).equalsIgnoreCase("Yes") ? true : false);
                rObjs[index].setPep(rowData.get(11).equalsIgnoreCase("Yes") ? true : false);
                index++;

            }
        }
        catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }finally {
            print();
        }
    }
    /*
     * (non-Javadoc)
     * @see Client#print()
     * Data to be printed. The data from array list is then mapped to respective fields as displayed as expected.
     *
     */
    public void print() {
        try{
            DecimalFormat formatter = new DecimalFormat("000,000.00");
            Currency curreny = Currency.getInstance(Locale.US);



            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("  ID\t\tAGE\tSEX\t\tREGION\t\tINCOME\t\tMORTGAGE");
            System.out.println("----------------------------------------------------------------------------------");
            for(int i=0;i<25;i++){
                System.out.format("%-16s %-6d %-15s %-15s %-16s %2s", rObjs[i].getId(), rObjs[i].getAge(), rObjs[i].getSex(),rObjs[i].getRegion(), curreny.getSymbol(Locale.US) + "" + formatter.format((rObjs[i].getIncome())),(rObjs[i].isMortgage() == true ? "Yes" : "No"));
                System.out.println("\n");
            }
            System.out.println("----------------------------------------------------------------------------------");

            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            System.out.println("Cur dt=" + timeStamp + "\n Gaurav Kesarwani\n");




        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double d) {
        this.income = d;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public boolean isSave_act() {
        return save_act;
    }

    public void setSave_act(boolean save_act) {
        this.save_act = save_act;
    }

    public boolean isCurrent_act() {
        return current_act;
    }

    public void setCurrent_act(boolean current_act) {
        this.current_act = current_act;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }

    public boolean isPep() {
        return pep;
    }

    public void setPep(boolean pep) {
        this.pep = pep;
    }


}
