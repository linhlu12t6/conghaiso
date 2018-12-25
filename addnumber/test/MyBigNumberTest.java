/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import addnumber.ExNumberFormatException;
import addnumber.IReceiver;
import addnumber.MyBigNumber;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linh
 */
public class MyBigNumberTest implements IReceiver{
    
    public MyBigNumberTest() {
    }
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void Sum_T1() {       
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("45", "544");
            assertEquals("589", result);       
    }
    
    @Test
    public void Sum_T2() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("11", "59");
            assertEquals("70", result);        
    }
    
    @Test
    public void Sum_T3() {
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1593", "74");
            assertEquals("1667", result);
    }
    
     @Test
    public void Sum_T4() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("", "0");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T5() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("11-", "85");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T6() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-1", "75");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T7() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("agc", "98");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T8() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("wec+1", "48");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T9() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("+**)(^", "*&&");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T10() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123.456", "89");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T11() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("", "1");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T12() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1", "");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T13() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1as", "236");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T14() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("252", "1a");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T15() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("#@#$@", "1a");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T16() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("%$#", "123#!@#");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T17() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("!#@!#", "!#@#@");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T18() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-252", "!@#");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T19() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("25.12", "12#!@3");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T20() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("hfgg", "1agg");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Test
    public void Sum_T21() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("2-", "$%$%");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí lỗi : ", ex);
        }
    }
    
    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
    
}