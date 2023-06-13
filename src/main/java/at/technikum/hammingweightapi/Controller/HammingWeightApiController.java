package at.technikum.hammingweightapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingWeightApiController {
    private String previousString;

    private int calculateHammingWeight(String string)
    {
        int count = 0;
        for (char c : string.toCharArray()){
            if (c!='0'){
                count++;
            }
        }
        return count;
    }

    @GetMapping("/api/hamming/previous")
    public int getPreviousHammingWeight() {
        if (previousString == null) {
            return 0;
        } else {
            return calculateHammingWeight(previousString);
        }
    }



    @GetMapping("/api/hamming")
    public int getHammingWeight(@RequestParam("string")String string)
    {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;

    }

}
