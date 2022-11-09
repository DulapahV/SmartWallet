package MyStudyPlan;

import java.awt.Color;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

class LocalDateSerializer implements JsonSerializer<LocalDate> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

    @Override
    public JsonElement serialize(LocalDate localDate, Type srcType, JsonSerializationContext context) {
        return new JsonPrimitive(formatter.format(localDate));
    }
}

class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss");

    @Override
    public JsonElement serialize(LocalDateTime localDateTime, Type srcType, JsonSerializationContext context) {
        return new JsonPrimitive(formatter.format(localDateTime));
    }
}

class LocalTimeSerializer implements JsonSerializer<LocalTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH::mm::ss");

    @Override
    public JsonElement serialize(LocalTime localTime, Type srcType, JsonSerializationContext context) {
        return new JsonPrimitive(formatter.format(localTime));
    }
}

class ColorSerializer implements JsonSerializer<Color> {

    @Override
    public JsonElement serialize(Color color, Type srcType, JsonSerializationContext context) {
        return new JsonPrimitive(String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()));
    }
}

class LocalDateDeserializer implements JsonDeserializer<LocalDate> {

    @Override
    public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        return LocalDate.parse(json.getAsString(),
                DateTimeFormatter.ofPattern("d-MMM-yyyy").withLocale(Locale.ENGLISH));
    }
}

class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        return LocalDateTime.parse(json.getAsString(),
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss").withLocale(Locale.ENGLISH));
    }
}

class LocalTimeDeserializer implements JsonDeserializer<LocalTime> {
    
        @Override
        public LocalTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            return LocalTime.parse(json.getAsString(),
                    DateTimeFormatter.ofPattern("HH::mm::ss").withLocale(Locale.ENGLISH));
        }
}

class ColorDeserializer implements JsonDeserializer<Color> {

    @Override
    public Color deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        return Color.decode(json.getAsString());
    }
}
