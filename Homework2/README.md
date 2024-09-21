# Fall 2024 SWE 3643 Testing and QA Homework
## Nino Tkabladze

# Homework 2:
  1. Performed Branch Analysis  
     *Studied a block of pseudocode and converted it to a graph showing every possible path*
     ```mermaid
     flowchart TD
         
         FuncA[ENTRY FUNC: Compute Sample Std Dev] --> FuncC
         FuncB[ENTRY FUNC: Compute Pop Std Dev] --> FuncC
     
         FuncC[FUNC Compute Standard Deviation] --> isA
     
         isA{is valueList empty?} --> |Yes| errorA[[error]]
         isA --> |No|FuncD[FUNC Compute Mean of Values] --> isB
         
         isB{is valueList empty?} --> |Yes| errorB[[error]]
         isB --> |No| isC{is value in valueList?}
        
         isC --> |Yes| sumC[sum += value]
         sumC --> isC
         isC --> |No| FuncE[FUNC Compute Square of Differences] 
         FuncE --> isD{is valueList empty?}
         
         isD --> |Yes| errorD[[error]]
         isD --> |No| isE{is value in valueList?}
     
         isE --> |Yes| squareAccumulatorE[squareAccumulator]
         squareAccumulatorE --> isE
         isE --> |No| FuncF[FUNC Compute Variance]
         FuncF --> isF{is not population?}
         
         isF --> |Yes| numValuesF[numValues--] --> isG{numValues<1}
         isF --> |No| isG
     
         isG --> |Yes| errorG[[error]]
         isG --> |No| stdDev[stdDev]

     ```
  2. Converted Pseudocode to Operational Code  
     *Converted the pseudocode to operational, well-structured Java code*  
     [pseudocode](https://github.com/ninuljaja/SWE3643-Fall2024-Homework/blob/8af1af670679f05ef102242dcd3bab4b38fd87d4/pseudocode.txt)
  3. Wrote Unit Tests  
     *Wrote 12 JUnit unit tests and achieved 100% coverage of every branch*
  4. Performed Coverage Analysis  
     *Achieved 100% coverage of all branches*  
     ![img.png](img.png)