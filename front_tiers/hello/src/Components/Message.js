function Message({name, job, age}) {
    return (
    <p className="alert alert-success">
        This is message from <b>{name}</b> who is a <b>{job}, and he is {""}</b>
        <b>{age}</b> years old.

    </p>
)
    
  }
  
  /* function Message(props){
    return (
        <p  className="bg-primary  text-while display-5">
            This is a message from <b>{props.name}</b> who is a <b>{props.job}  </b>and <b>{props.age}</b>
        </p>
    )
}*/ export default Message;
