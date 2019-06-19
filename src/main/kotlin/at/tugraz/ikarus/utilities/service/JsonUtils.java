package at.tugraz.ikarus.utilities.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {

    public static boolean isValid(String json) {
        try {
            new ObjectMapper()
                    .enable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)
                    .enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)
                    .readTree(json);
            return true;
        } catch (IOException e) {
            return false;
        }

    }

}
