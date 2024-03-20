/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author eduardopinzon
 */
public class Reservation {
    
    public Nodo insert(int element, Nodo root, Nodo father){
        
      Nodo node = new Nodo(element);
      if (isEmpty()){
          setRoot(node);
      } else {
          if (element < root.getElement()){
              root.setLeftSon(insert(element,root.getLeftSon(), root));
          } else{
              root.setRightSon(insert(element,root.getRightSon(), root));
          }
      }
       return root; 
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setRoot(Nodo node) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
