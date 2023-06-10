<h3>Serilization</h3>
<ul>
  <li>It is a mechanism of writing the state of an object into a byte-stream</li>
  <li>It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.</li>
  <li>For serializing the object, we call the writeObject() method of ObjectOutputStream</li>
  </ul>
  
  <h3>Deserilzation</h3>
  <ul>
  <li>The reverse operation of serialization is called deserialization where byte-stream is converted into an object</li>
  <li>The serialization and deserialization process is platform-independent.
   <li> Can serialize an object on one platform and deserialize it on a different platform.</li>
  <li>For deserialization we call the readObject() method of ObjectInputStream class.</li>
  </ul>
  
  <h3>Java Serialization with Inheritance (IS-A Relationship)</h3>
    <ul>
  <li>If a class implements Serializable interface then all its sub classes will also be serializable</li>
   </ul>
   
   <h3>Java Serialization with Aggregation (HAS-A Relationship)</h3>
    <ul>
  <li>If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed. In such case, NotSerializableException is thrown at runtime.</li>
   </ul>
   
<h3>Java Serialization with the static data member</h3>
  <ul>
  <li>If there is any static data member in a class, it will not be serialized because static is the part of class not object.</li>
 </ul>

