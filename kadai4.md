```uml
@startuml
:weather=into();
if(weather==0) then (true)
  :晴れ;
  else if(weather==1) then (true)
    :曇り;
   else(false)
   :雨;
   
   endif
   end
   @enduml
    
