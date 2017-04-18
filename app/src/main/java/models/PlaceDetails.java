package models;

import java.util.List;

/**
 * Created by shalakhaverma on 16/04/2017.
 */

public class PlaceDetails {


    /**
     * debug_log : {"line":[]}
     * html_attributions : []
     * result : {"address_components":[{"long_name":"5","short_name":"5","types":[]},{"long_name":"48","short_name":"48","types":["street_number"]},{"long_name":"Pirrama Road","short_name":"Pirrama Rd","types":["route"]},{"long_name":"Pyrmont","short_name":"Pyrmont","types":["locality","political"]},{"long_name":"New South Wales","short_name":"NSW","types":["administrative_area_level_1","political"]},{"long_name":"Australia","short_name":"AU","types":["country","political"]},{"long_name":"2009","short_name":"2009","types":["postal_code"]}],"adr_address":"5, <span class=\"street-address\">48 Pirrama Road<\/span>, <span class=\"locality\">Pyrmont<\/span> <span class=\"region\">NSW<\/span> <span class=\"postal-code\">2009<\/span>, <span class=\"country-name\">Australia<\/span>","formatted_address":"5, 48 Pirrama Road, Pyrmont NSW 2009, Australia","formatted_phone_number":"(02) 9374 4000","geometry":{"location":{"lat":-33.866611,"lng":151.195832}},"icon":"http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"4f89212bf76dde31f092cfc14d7506555d85b5c7","international_phone_number":"+61 2 9374 4000","name":"Google","opening_hours":{"open_now":false,"periods":[{"close":{"day":1,"time":"1730"},"open":{"day":1,"time":"0830"}},{"close":{"day":2,"time":"1730"},"open":{"day":2,"time":"0830"}},{"close":{"day":3,"time":"1730"},"open":{"day":3,"time":"0830"}},{"close":{"day":4,"time":"1730"},"open":{"day":4,"time":"0830"}},{"close":{"day":5,"time":"1700"},"open":{"day":5,"time":"0830"}}],"weekday_text":["Monday: 8:30 am \u2013 5:30 pm","Tuesday: 8:30 am \u2013 5:30 pm","Wednesday: 8:30 am \u2013 5:30 pm","Thursday: 8:30 am \u2013 5:30 pm","Friday: 8:30 am \u2013 5:00 pm","Saturday: Closed","Sunday: Closed"]},"photos":[{"height":2322,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/107252953636064841537\">William Stewart<\/a>"],"photo_reference":"CmRdAAAAC ...photo_reference truncated in this example","width":4128},{"height":960,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/100919424873665842845\">Donnie Piercey<\/a>"],"photo_reference":"CmRdAAAAcu ...photo_reference truncated in this example","width":1280},{"height":1365,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/105932078588305868215\">Maksym Kozlenko<\/a>"],"photo_reference":"CmRdAAAAT ...photo_reference truncated in this example","width":2048},{"height":2048,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAAG ...photo_reference truncated in this example","width":1536},{"height":2368,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/108508601154030859314\">Leo Angelo George<\/a>"],"photo_reference":"CmRdAAAAM3 ...photo_reference truncated in this example","width":3200},{"height":608,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/116750797999944764767\">Jessica Pfund<\/a>"],"photo_reference":"CmRdAAAAspq ...photo_reference truncated in this example","width":1080},{"height":2048,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAA5s ...photo_reference truncated in this example","width":1536},{"height":1536,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAAWu ...photo_reference truncated in this example","width":2048},{"height":1536,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAA_L7 ...photo_reference truncated in this example","width":2048},{"height":612,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/114701241123617315548\">Margaret L<\/a>"],"photo_reference":"CmRdAAAAe2L3 ...photo_reference truncated in this example","width":816}],"place_id":"ChIJN1t_tDeuEmsRUsoyG83frY4","rating":4.4,"reference":"CmRaAAAAdOrk ...reference truncated in this example","reviews":[{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Danielle Lonnon","author_url":"https://plus.google.com/118257578392162991040","language":"en","rating":5,"text":"As someone who works in the theatre, I don't find the Google offices nerdy, I find it magical and theatrical. Themed rooms  with useful props and big sets with unique and charismatic characters. You sure this isn't a theatre company? Oh no wait Google has money, while the performing art does not.","time":1425790392},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Rob Mulally","author_url":"https://plus.google.com/100839435712919930388","language":"en","rating":5,"text":"What can I say, what a great building, cool offices and friendly staff!\nonly had a quick tour but there isn't much missing from this world class modern office.\n\nIf your staff who work here I hope you take advantage of all that it offers , because as a visitor it was a very impressive setup. \n\nThe thing that stood out besides the collaborative area's and beds for resting, was the food availability.\n\nImpressed. 5 Stars.\n","time":1408284830},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Michael Yeung","author_url":"https://plus.google.com/104161906493535874402","language":"en","rating":5,"text":"Best company in the world. The view from the cafeteria is unreal, you take in the entire Darling harbour view like nowhere else :)","time":1435313350},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Ibrahim El-Jamal","author_url":"https://plus.google.com/103646390098458637797","language":"en","rating":5,"text":"Great track, great staff, overall great experience!!!!! ","time":1434331674},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Marco Palmero","author_url":"https://plus.google.com/103363668747424636403","language":"en","rating":5,"text":"I've been fortunate enough to have visited the Google offices on multiple occasions through the years and I've found this place to be quite awesome. This particular office is the original campus for Google Sydney and they've expanded to the Fairfax building where they've built an even more exciting office!\n\nTotally jealous of their cafeteria and the city views from their office!","time":1413529682}],"scope":"GOOGLE","types":["establishment"],"url":"https://plus.google.com/111337342022929067349/about?hl=en-US","utc_offset":600,"vicinity":"5 48 Pirrama Road, Pyrmont","website":"https://www.google.com.au/about/careers/locations/sydney/"}
     * status : OK
     */

    private DebugLogBean debug_log;
    private ResultBean result;
    private String status;
    private List<?> html_attributions;

    public DebugLogBean getDebug_log() {
        return debug_log;
    }

    public void setDebug_log(DebugLogBean debug_log) {
        this.debug_log = debug_log;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public static class DebugLogBean {
        private List<?> line;

        public List<?> getLine() {
            return line;
        }

        public void setLine(List<?> line) {
            this.line = line;
        }
    }

    public static class ResultBean {
        /**
         * address_components : [{"long_name":"5","short_name":"5","types":[]},{"long_name":"48","short_name":"48","types":["street_number"]},{"long_name":"Pirrama Road","short_name":"Pirrama Rd","types":["route"]},{"long_name":"Pyrmont","short_name":"Pyrmont","types":["locality","political"]},{"long_name":"New South Wales","short_name":"NSW","types":["administrative_area_level_1","political"]},{"long_name":"Australia","short_name":"AU","types":["country","political"]},{"long_name":"2009","short_name":"2009","types":["postal_code"]}]
         * adr_address : 5, <span class="street-address">48 Pirrama Road</span>, <span class="locality">Pyrmont</span> <span class="region">NSW</span> <span class="postal-code">2009</span>, <span class="country-name">Australia</span>
         * formatted_address : 5, 48 Pirrama Road, Pyrmont NSW 2009, Australia
         * formatted_phone_number : (02) 9374 4000
         * geometry : {"location":{"lat":-33.866611,"lng":151.195832}}
         * icon : http://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png
         * id : 4f89212bf76dde31f092cfc14d7506555d85b5c7
         * international_phone_number : +61 2 9374 4000
         * name : Google
         * opening_hours : {"open_now":false,"periods":[{"close":{"day":1,"time":"1730"},"open":{"day":1,"time":"0830"}},{"close":{"day":2,"time":"1730"},"open":{"day":2,"time":"0830"}},{"close":{"day":3,"time":"1730"},"open":{"day":3,"time":"0830"}},{"close":{"day":4,"time":"1730"},"open":{"day":4,"time":"0830"}},{"close":{"day":5,"time":"1700"},"open":{"day":5,"time":"0830"}}],"weekday_text":["Monday: 8:30 am \u2013 5:30 pm","Tuesday: 8:30 am \u2013 5:30 pm","Wednesday: 8:30 am \u2013 5:30 pm","Thursday: 8:30 am \u2013 5:30 pm","Friday: 8:30 am \u2013 5:00 pm","Saturday: Closed","Sunday: Closed"]}
         * photos : [{"height":2322,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/107252953636064841537\">William Stewart<\/a>"],"photo_reference":"CmRdAAAAC ...photo_reference truncated in this example","width":4128},{"height":960,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/100919424873665842845\">Donnie Piercey<\/a>"],"photo_reference":"CmRdAAAAcu ...photo_reference truncated in this example","width":1280},{"height":1365,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/105932078588305868215\">Maksym Kozlenko<\/a>"],"photo_reference":"CmRdAAAAT ...photo_reference truncated in this example","width":2048},{"height":2048,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAAG ...photo_reference truncated in this example","width":1536},{"height":2368,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/108508601154030859314\">Leo Angelo George<\/a>"],"photo_reference":"CmRdAAAAM3 ...photo_reference truncated in this example","width":3200},{"height":608,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/116750797999944764767\">Jessica Pfund<\/a>"],"photo_reference":"CmRdAAAAspq ...photo_reference truncated in this example","width":1080},{"height":2048,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAA5s ...photo_reference truncated in this example","width":1536},{"height":1536,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAAWu ...photo_reference truncated in this example","width":2048},{"height":1536,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/104177669626132953795\">Justine OBRIEN<\/a>"],"photo_reference":"CmRdAAAA_L7 ...photo_reference truncated in this example","width":2048},{"height":612,"html_attributions":["<a href=\"https://www.google.com/maps/views/profile/114701241123617315548\">Margaret L<\/a>"],"photo_reference":"CmRdAAAAe2L3 ...photo_reference truncated in this example","width":816}]
         * place_id : ChIJN1t_tDeuEmsRUsoyG83frY4
         * rating : 4.4
         * reference : CmRaAAAAdOrk ...reference truncated in this example
         * reviews : [{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Danielle Lonnon","author_url":"https://plus.google.com/118257578392162991040","language":"en","rating":5,"text":"As someone who works in the theatre, I don't find the Google offices nerdy, I find it magical and theatrical. Themed rooms  with useful props and big sets with unique and charismatic characters. You sure this isn't a theatre company? Oh no wait Google has money, while the performing art does not.","time":1425790392},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Rob Mulally","author_url":"https://plus.google.com/100839435712919930388","language":"en","rating":5,"text":"What can I say, what a great building, cool offices and friendly staff!\nonly had a quick tour but there isn't much missing from this world class modern office.\n\nIf your staff who work here I hope you take advantage of all that it offers , because as a visitor it was a very impressive setup. \n\nThe thing that stood out besides the collaborative area's and beds for resting, was the food availability.\n\nImpressed. 5 Stars.\n","time":1408284830},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Michael Yeung","author_url":"https://plus.google.com/104161906493535874402","language":"en","rating":5,"text":"Best company in the world. The view from the cafeteria is unreal, you take in the entire Darling harbour view like nowhere else :)","time":1435313350},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Ibrahim El-Jamal","author_url":"https://plus.google.com/103646390098458637797","language":"en","rating":5,"text":"Great track, great staff, overall great experience!!!!! ","time":1434331674},{"aspects":[{"rating":3,"type":"overall"}],"author_name":"Marco Palmero","author_url":"https://plus.google.com/103363668747424636403","language":"en","rating":5,"text":"I've been fortunate enough to have visited the Google offices on multiple occasions through the years and I've found this place to be quite awesome. This particular office is the original campus for Google Sydney and they've expanded to the Fairfax building where they've built an even more exciting office!\n\nTotally jealous of their cafeteria and the city views from their office!","time":1413529682}]
         * scope : GOOGLE
         * types : ["establishment"]
         * url : https://plus.google.com/111337342022929067349/about?hl=en-US
         * utc_offset : 600
         * vicinity : 5 48 Pirrama Road, Pyrmont
         * website : https://www.google.com.au/about/careers/locations/sydney/
         */

        private String adr_address;
        private String formatted_address;
        private String formatted_phone_number;
        private GeometryBean geometry;
        private String icon;
        private String id;
        private String international_phone_number;
        private String name;
        private OpeningHoursBean opening_hours;
        private String place_id;
        private double rating;
        private String reference;
        private String scope;
        private String url;
        private int utc_offset;
        private String vicinity;
        private String website;
        private List<AddressComponentsBean> address_components;
        private List<PhotosBean> photos;
        private List<ReviewsBean> reviews;
        private List<String> types;

        public String getAdr_address() {
            return adr_address;
        }

        public void setAdr_address(String adr_address) {
            this.adr_address = adr_address;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getFormatted_phone_number() {
            return formatted_phone_number;
        }

        public void setFormatted_phone_number(String formatted_phone_number) {
            this.formatted_phone_number = formatted_phone_number;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInternational_phone_number() {
            return international_phone_number;
        }

        public void setInternational_phone_number(String international_phone_number) {
            this.international_phone_number = international_phone_number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getUtc_offset() {
            return utc_offset;
        }

        public void setUtc_offset(int utc_offset) {
            this.utc_offset = utc_offset;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public List<AddressComponentsBean> getAddress_components() {
            return address_components;
        }

        public void setAddress_components(List<AddressComponentsBean> address_components) {
            this.address_components = address_components;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<ReviewsBean> getReviews() {
            return reviews;
        }

        public void setReviews(List<ReviewsBean> reviews) {
            this.reviews = reviews;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":-33.866611,"lng":151.195832}
             */

            private LocationBean location;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class LocationBean {
                /**
                 * lat : -33.866611
                 * lng : 151.195832
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : false
             * periods : [{"close":{"day":1,"time":"1730"},"open":{"day":1,"time":"0830"}},{"close":{"day":2,"time":"1730"},"open":{"day":2,"time":"0830"}},{"close":{"day":3,"time":"1730"},"open":{"day":3,"time":"0830"}},{"close":{"day":4,"time":"1730"},"open":{"day":4,"time":"0830"}},{"close":{"day":5,"time":"1700"},"open":{"day":5,"time":"0830"}}]
             * weekday_text : ["Monday: 8:30 am \u2013 5:30 pm","Tuesday: 8:30 am \u2013 5:30 pm","Wednesday: 8:30 am \u2013 5:30 pm","Thursday: 8:30 am \u2013 5:30 pm","Friday: 8:30 am \u2013 5:00 pm","Saturday: Closed","Sunday: Closed"]
             */

            private boolean open_now;
            private List<PeriodsBean> periods;
            private List<String> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<PeriodsBean> getPeriods() {
                return periods;
            }

            public void setPeriods(List<PeriodsBean> periods) {
                this.periods = periods;
            }

            public List<String> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<String> weekday_text) {
                this.weekday_text = weekday_text;
            }

            public static class PeriodsBean {
                /**
                 * close : {"day":1,"time":"1730"}
                 * open : {"day":1,"time":"0830"}
                 */

                private CloseBean close;
                private OpenBean open;

                public CloseBean getClose() {
                    return close;
                }

                public void setClose(CloseBean close) {
                    this.close = close;
                }

                public OpenBean getOpen() {
                    return open;
                }

                public void setOpen(OpenBean open) {
                    this.open = open;
                }

                public static class CloseBean {
                    /**
                     * day : 1
                     * time : 1730
                     */

                    private int day;
                    private String time;

                    public int getDay() {
                        return day;
                    }

                    public void setDay(int day) {
                        this.day = day;
                    }

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class OpenBean {
                    /**
                     * day : 1
                     * time : 0830
                     */

                    private int day;
                    private String time;

                    public int getDay() {
                        return day;
                    }

                    public void setDay(int day) {
                        this.day = day;
                    }

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }
        }

        public static class AddressComponentsBean {
            /**
             * long_name : 5
             * short_name : 5
             * types : []
             */

            private String long_name;
            private String short_name;
            private List<?> types;

            public String getLong_name() {
                return long_name;
            }

            public void setLong_name(String long_name) {
                this.long_name = long_name;
            }

            public String getShort_name() {
                return short_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public List<?> getTypes() {
                return types;
            }

            public void setTypes(List<?> types) {
                this.types = types;
            }
        }


        public static class ReviewsBean {
            /**
             * aspects : [{"rating":3,"type":"overall"}]
             * author_name : Danielle Lonnon
             * author_url : https://plus.google.com/118257578392162991040
             * language : en
             * rating : 5
             * text : As someone who works in the theatre, I don't find the Google offices nerdy, I find it magical and theatrical. Themed rooms  with useful props and big sets with unique and charismatic characters. You sure this isn't a theatre company? Oh no wait Google has money, while the performing art does not.
             * time : 1425790392
             */

            private String author_name;
            private String author_url;
            private String language;
            private int rating;
            private String text;
            private int time;
            private List<AspectsBean> aspects;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getAuthor_url() {
                return author_url;
            }

            public void setAuthor_url(String author_url) {
                this.author_url = author_url;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public List<AspectsBean> getAspects() {
                return aspects;
            }

            public void setAspects(List<AspectsBean> aspects) {
                this.aspects = aspects;
            }

            public static class AspectsBean {
                /**
                 * rating : 3
                 * type : overall
                 */

                private int rating;
                private String type;

                public int getRating() {
                    return rating;
                }

                public void setRating(int rating) {
                    this.rating = rating;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }
        }
    }
}
