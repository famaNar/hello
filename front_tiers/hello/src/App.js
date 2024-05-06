import './App.css';
import Message from './Components/Message';

function App() {
  return (
    <div className="App">
    <Message name="Fama" job='engineer' age= {32}/>
    <Team name ="Barca" title={5}/>
    <Team name ="OM" title={5}/>
    <Team name ="Liverpool" title={5}/>

    </div>
  );
}
 
export default App;
