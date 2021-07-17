function Person(initialAge){
    //if age is negative, set it to 0 and print "Age is not valid, setting age to 0."
    if (initialAge >= 0)
        this.age = initialAge
    else {
        console.log("Age is not valid, setting age to 0.")
        this.age = 0
    }
    // console.log(this.age)    
  this.amIOld=function(){
//    this.age < 13 ? console.log("You are young.") :  this.age < 18 ? console.log("You are a teenager.") : console.log("You are old.")
   const status = this.age < 13 ? "young" : this.age < 18 ? "a teenager" : "old"
   console.log(`You are ${status}.`)
    //are you kidding me? I'm officialy old! :)
  };
   this.yearPasses=function(){
          // Increment the age of the person in here
          this.age++
   };
}

const ade = new Person(17)
ade.amIOld()
for(let i = 0; i < 3; i++) ade.yearPasses()
ade.amIOld()