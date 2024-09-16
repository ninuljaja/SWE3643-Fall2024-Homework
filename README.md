# Fall 2024 SWE 3643 Testing and QA Homework
## Nino Tkabladze

 - Homework 2:
   1. Performed Branch Analysis
       *Studied a block of pseudocode and converted it to a graph showing every possible path*
       ```mermaid
       flowchart TD
          start(((StandardDeviation))) --> isA
    
          isA{valueList empty} --> |Yes| errorA[error]
          isA --> |No| isB{valueList empty}
    
          isB{valueList empty} --> |Yes| errorB[error]
          isB --> |No| isC[value in valueList]
    
          isC{value in valueList} --> |Yes| sumC[sum += value]
          sumC --> isC
          isC --> |No| isD{valueList empty}
    
          isD --> |Yes| errorD[error]
          isD --> |No| isE{value in valueList}
    
          isE --> |Yes| squareAccumulatorE[squareAccumulator]
          squareAccumulatorE --> isE
          isE --> |No| isF{is not population}
    
          isF --> |Yes| numValuesF[numValues--] --> isG{numValues<1}
          isF --> |No| isG
    
          isG --> |Yes| errorG[error]
          isG --> |No| stdDev[stdDev]
          stdDev --> isH
    
          isH{valueList empty} --> |Yes| errorH[error]
          isH --> |No| isI{valueList empty}
    
          isI{valueList empty} --> |Yes| errorI[error]
          isI --> |No| isJ[value in valueList]
    
          isJ{value in valueList} --> |Yes| sumJ[sum += value]
          sumJ --> isJ
          isJ --> |No| isK{valueList empty}
    
          isK --> |Yes| errorK[error]
          isK --> |No| isL{value in valueList}
    
          isL --> |Yes| squareAccumulatorL[squareAccumulator += squareOfDifference]
          squareAccumulatorL --> isL
          isL --> |No| isM{is not population}
    
          isM --> |Yes| numValuesM[numValues--] --> isN{numValues<1}
          isM --> |No| isN
    
          isN --> |Yes| errorN[error]
          isN --> |No| popStdDev[population Std Dev]
       ```
   2. Converted Pseudocode to Operational Code
      *Converted the pseudocode to operational, well-structured { LANGUAGE YOU USED }*
      { LINK TO PSEUDOCODE FILE } 
   2. Wrote Unit Tests
      *Wrote {# of Tests} { NUnit, JUnit, or PyTest } unit tests and achieved 100% coverage of every branch*
   3. Performed Coverage Analysis
      *Achieved 100% coverage of all branches*
      { SCREENSHOT OF YOUR COVERAGE ANALYSIS HERE }