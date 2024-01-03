package systems.arthais.calendlypoc.calendly.dtos.requests;

import java.util.List;

public class OneOffEventTypeResponse {
    private String uri;
    private String name;
    private Boolean active;
    private String slug;
    private String scheduling_url;
    private Integer duration;
    private String kind;
    private String pooling_type;
    private String type;
    private String color;
    private String created_at;
    private String updated_at;
    private String internal_note;
    private String description_plain;
    private String description_html;
    private Profile profile;
    private Boolean secret;
    private String booking_method;
    private List<CustomQuestion> custom_questions;
    private String deleted_at;
    private Boolean admin_managed;

    // Getters, setters e outras propriedades conforme necessário

    // Classes internas para Profile, CustomQuestion, etc., se necessário
}

public class Profile {
    // Campos da classe Profile
}

public class CustomQuestion {
    // Campos da classe CustomQuestion
}
