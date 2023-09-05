/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.iftm.manipulacaostring;

import javax.swing.JOptionPane;

/**
 *
 * @author IFTM
 */
public class ManipulacaoString {

        
       public static int Vogais (String string){
           String minuscula = string.toLowerCase();
           
           int qtdeV = 0;
           
           for(int i = 0; i < minuscula.length(); i++){
               char c = minuscula.charAt(i);
               if((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')){
                   qtdeV++;
               }
           }
           return qtdeV;
       }
       
       public static int Consoantes(String string){
           String minuscula = string.toLowerCase();
           
           int qtdeC = 0;
           
           for(int i = 0; i < minuscula.length(); i++){
               char c = minuscula.charAt(i);
               if(!(c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')){
                   qtdeC++;
               }
           }
           return qtdeC;
       }
       
       public static int Tamanho(String string){
           
           return string.length();
           
       }
       
       public static String Inverter(String string){
           
           StringBuilder inverter = new StringBuilder(string);
           
           return inverter.reverse().toString();
                   
           
       }
       
       public static boolean Palindromo(String string){
           
           String minuscula = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
           
           StringBuilder inverse = new StringBuilder(minuscula).reverse();
           return minuscula.equals(inverse.toString());
       }
       
       public static String Criptografar(String string, int n){
           
           StringBuilder textoCrip = new StringBuilder();
           
           for(int i = 0; i < string.length(); i++){
               char c = string.charAt(i);
               
               if(Character.isLowerCase(c)){
                   char cCrip = (char) ('a' + (c - 'a' +n) %26);
                   textoCrip.append(cCrip);
               }else{
                   textoCrip.append(c);
               }
               
           }
           
           return textoCrip.toString();
       }
   
}
