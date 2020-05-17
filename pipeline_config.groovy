application_environments {
   global {
      A = "jteapp A"
      B = "jteapp B"
      C {
         C1 = "jteapp C"
      }
      D = "jteapp D"
   }
   
}

libraries{
   libsimple {
      A = "jteapp A from lib"
   }
      libA
   }
