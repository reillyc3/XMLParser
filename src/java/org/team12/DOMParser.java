package org.team12;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class DOMParser {

   public static void main(String[] args) {

      try {
         File inputFile = new File("CarXML.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("vehicle");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("ID : " 
                  + eElement
                  .getElementsByTagName("id")
                  .item(0)
                  .getTextContent());
               System.out.println("Make : " 
                  + eElement
                  .getElementsByTagName("make")
                  .item(0)
                  .getTextContent());
               System.out.println("Model : " 
                  + eElement
                  .getElementsByTagName("model")
                  .item(0)
                  .getTextContent());
               System.out.println("Color : " 
                  + eElement
                  .getElementsByTagName("color")
                  .item(0)
                  .getTextContent());
               System.out.println("License Plate : " 
                  + eElement
                  .getElementsByTagName("licenseplate")
                  .item(0)
                  .getTextContent());
               System.out.println("Year : " 
                  + eElement
                  .getElementsByTagName("year")
                  .item(0)
                  .getTextContent());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

