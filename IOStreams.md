<h2>Introduction to IOStreams in Java</h2>
<h3>What are IOStreams?</h3>
 <img src="src\images\Input-Output-Stream_base_diagram.jpg" alt="Trulli">
 <h3>Types of Streams:</h3>
 <ol>
 <li>Input Stream:These streams are used to read data that must be taken as an input from a source array or file or any peripheral device. For eg., FileInputStream, BufferedInputStream, ByteArrayInputStream etc.</li>
 <li>
  Output Stream: These streams are used to write data as outputs into an array or file or any output peripheral device. For eg., FileOutputStream, BufferedOutputStream, ByteArrayOutputStream etc.
 </li>
 </ol>
 <img src="src\images\Java-Input-Stream.png" alt="Trulli" width="500" height="333">
 <img src="src\images\Java-Output-Stream.png" alt="Trulli" width="500" height="333">
<ul>
  <li>IOStreams provide an efficient way to handle input and output operations in Java.</li>
  <li>They are used to read from and write to different types of data sources, such as files, network connections, and memory.</li>
  </ul>
    <h3>Types of IOStreams</h3>
    <ul>
  <li>Java IOStreams are classified into two types:</li>
  <ul>
    <li>Byte Streams: Used for handling raw binary data.</li>
    <li>Character Streams: Used for handling character-based data, such as text.</li>
  </ul>
  </ul>
  
  
   <h3>Byte Streams</h3>
    <ul>
      <li>Byte Streams read and write data as individual bytes.</li>
      <li>Example byte stream classes:</li>
      <ul>
        <li>InputStream: Used to read bytes from a data source.</li>
         <li>OutputStream: Used to write bytes to a data destination.</li>
      </ul>
       </ul>
    <h3>Character Streams</h3>
   <ul>
     <li>Character Streams read and write data as characters.</li>
     <li>Example character stream classes:</li>
     <ul>
       <li>Reader: Used to read characters from a data source.</li>
       <li>Writer: Used to write characters to a data destination.</li>
     </ul>
  </ul>
  
  <h3>Object Streams</h3>
  <ul>
  <li>Need for object serialization in Java.</li>
  <li>What is ObjectInputStream and ObjectOutputStream for object streams.</li>
  <li>readObject() and writeObject() methods for reading and writing objects.</li>
  </ul>
  
   <h3>Standard IO streams</h3>
    <img src="src\images\Standars_IO_Streams.png" alt="Trulli" width="500" height="333">
    <ul>
    <li>Describe the three standard IO streams: System.in, System.out, and System.err.</li>
     <li>System.in: Standard input stream for reading data from the console.</li>
       <li>System.out: Standard output stream for writing data to the console.</li>
      <li>System.err: Standard error stream for writing error messages to the console</li>
      </ul>
  
   <h3>IOStream Classes</h3>
  <ul>
    <li>FileInputStream: Reads bytes from a file.</li>
    <li>FileOutputStream: Writes bytes to a file.</li>
    <li>FileReader: Reads characters from a file.</li>
    <li>FileWriter: Writes characters to a file.</li>
    <li>BufferedReader: Efficiently reads characters from a Reader.</li>
    <li>BufferedWriter: Efficiently writes characters to a Writer.</li>
     </ul>
