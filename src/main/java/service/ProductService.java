package service;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ProductService {
    public void parse() {

        String json = "{\n" +
                "    \"title\": {\n" +
                "    \"isbn_13\": \"0140328726\",\n" +
                "    \"number_of_pages\": 96\n" +
                "    }\n" +
                "}";
//        }
        GsonBuilder gsonBldr = new GsonBuilder();
        gsonBldr.registerTypeAdapter(Foo.class, new FooDeserializer());
        Foo targetObject = gsonBldr.create().fromJson(json, Foo.class);

    }

    public class Foo {

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public class FooDeserializer implements JsonDeserializer<Foo> {

        @Override
        public Foo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

            JsonArray jObject = jsonElement.getAsJsonArray();




            return null;
        }
    }
}
