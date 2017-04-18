package models;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by saurabhverma on 8/04/2017.
 */

public class Placesearch implements Serializable {

    /**
     * html_attributions : []
     * next_page_token : CpQCBwEAAGq6rtcnP_ghmgauJUWtNlLdkmgYw7txObRbcz7gzPIh_3byjUzJwt1uI7m5OSkA3cT9rBxf7QaEQQOUbblRBmYhraT9eEFg6Ok__Qw_DRAXkMlSOGJNNpH5jET2au_y9pkT_FmtZsCoVG_T9bPlOB4HLBCRg-YSv5-8RC1Qkt2pIm1dKhBp06enXxOsY7rPsgR-ZyU_nPC_2de06uAugWeTxJCHXnSmQJp2gT80eK_pdoAlB8yW1L5ur6Nx1OEcsVH0NV337qOeC4eIOMqvQ4XqWKpRsApVx4MT35SpmjTwqTIeM_q8TFlwNQ8pNMP1kmm16X3S9FcXNnk72Yo0W6r8J9enBjOjPkXbE3rXjPofEhAJNB5yEjEtO26XMQKscdQDGhRuodQHvXB2QyHKxg3Ya4_gmd2bVA
     * results : [{"geometry":{"location":{"lat":37.4082392,"lng":-122.1197784},"viewport":{"northeast":{"lat":37.4092879302915,"lng":-122.1190242197085},"southwest":{"lat":37.40658996970851,"lng":-122.1217221802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"73794679484e426aadc7c6cfdb1026864beea194","name":"Dinah's Garden Hotel Palo Alto","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":910,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115212688446356792868/photos\">Dinah&#39;s Garden Hotel Palo Alto<\/a>"],"photo_reference":"CoQBdwAAAHo-HLlO3Bk9Z_Pf2pVcLaHxrELAREl4gsSYW6MI1hH_jbeT_KAPSS0TPNhuejERTk_CLsfu2kBr1MOcnV6oGb6saP7ZeUv8Pzc9byvnrg7jzi20AjIB5cAB9p6dJpFu4p-YPEGQcJrEZisoPwQDI2CpCLWDjXrshEit5Z8LsEDLEhA7eGE3acaZPDQyL8doWJWiGhRi6C1EMPVxUoC-zx6-hsHfZid4Sw","width":909}],"place_id":"ChIJxUf2lnm6j4ARf-dI1c4L9sA","rating":4.1,"reference":"CmRSAAAAsU-9Ff7JaUQyfYFluwQwHL4lY3XHejNb1Yxg64XZdQiiJUDPj_Xmmo2_B_H2W0qLTxnlQf-YTnm6ivv7x21MJMLTAOMbdni3MWtITj1odwJdTjMLa8Xfm4K6vzVfGQwoEhDMIRKto2nUhOL4N5dicT-LGhQHzBTkLiSe3CCFXudQxSeRw0mpjw","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"4261 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.4406279,"lng":-122.1630952},"viewport":{"northeast":{"lat":37.4418513302915,"lng":-122.1619269197085},"southwest":{"lat":37.4391533697085,"lng":-122.1646248802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"de58b1e93c777d3e23e8109b4aee8d1ac16a1d32","name":"The Westin Palo Alto","photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107536884079914024297/photos\">Chu David<\/a>"],"photo_reference":"CoQBdwAAAKRjSU4iqY-vRZQL1E0OdVPEBu0HJ9TMmcnqx1L59kyaxv5z3kS8M9u9lbr02T5_l9xP_R_GGKxWS_HEQRX3IRf28vOvgZVI4yXSlP3oonk9GKv1N3TLZn9Szw8lu9oZdYFj1fCkEJ5-VeQxV6-5OjeQ7ki9-5Dqs5yWjcDRBxaxEhBmSOz3UiwgUDA0rXWsjhUaGhTcW2QerwqO0jgxfo0hf5NOX6zXIg","width":4032}],"place_id":"ChIJY9A7oDq7j4ARviPFylKiIHs","rating":4.1,"reference":"CmRRAAAAUqVYO1VTvQbNEXebBL4GxkOhOI2i9Y3QI4fYSabZosuy8ZNqdag9RMLObpGk33JZdo9zPOJiDm1QItExpNSSxC3Wfo4OJzYhLTsr5fGaP1r9j1-ivCvOMPSXEC0qxmFVEhBvLtDcNtSsAZPk1PXJwnwxGhR96slRP2AwEWrU_Kxx6SOmp4xQ8Q","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"675 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.4414392,"lng":-122.1636933},"viewport":{"northeast":{"lat":37.4425959302915,"lng":-122.1626086697085},"southwest":{"lat":37.4398979697085,"lng":-122.1653066302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"914be55131be933d6ffbd70cf9dea99c52cd3bfa","name":"Sheraton Palo Alto Hotel","photos":[{"height":3120,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115878912838161270871/photos\">Jeff Kenton<\/a>"],"photo_reference":"CoQBdwAAAIW5TdKpzAhV2MlhmM4Z-FCSjxbDH_J1tyX3OtDPLMNWgqbZYDXPDtwMOrCn44pthGimLCa9CE7-YTWeoMrqc7AY-gUGrfo_i0WFI6rvpn28GfUPxwR_iWYPf4Kp9e0iVKIled-zEHvvNzEtHZog6qNS-qA9Mb_F8wzKKgMJDWDHEhAo2F7R4xAWcvS1CbBB9ucEGhS6mO1GzpwT2Q4EeJq7zyR2kZ5-WA","width":4160}],"place_id":"ChIJIe9vfzC7j4ARL2079N3yvfc","rating":4,"reference":"CmRSAAAAseeu9Q4aDMzUsntsVyPv4xpIOC-AW8zrksE22Dbb4zQLGoIuPYZsf7v75M-PXyF3Bz4bfj3CzBil-7W_s4c7UZyGHpjozNnKXciJGQ-nhQ0mnVeBXJmvzWUMHMVplzQ8EhB-lbN4Bcl-L6DlTuu6wOsqGhR8Ggeb2iLHv8L0dhXZewN3uLBpRg","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"625 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.4027846,"lng":-121.9770478},"viewport":{"northeast":{"lat":37.4041301302915,"lng":-121.9757226697085},"southwest":{"lat":37.4014321697085,"lng":-121.9784206302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"c45975688a780579dad3df21aea2ee9144ff6e83","name":"Hilton Santa Clara","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":900,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105655753983144928797/photos\">Arkadi Avagyan<\/a>"],"photo_reference":"CoQBdwAAACoteST7Eng90bmHR6EL6zPTSecUKFzRT0M9F1qyQSNff3bOSYQYUWJWs4nBHTSyhD1xKyucdgebbdjCbPmbK8p2YHobmJHi526k9AzYSiub3r87kZlsgDl8fkQbig19HtKIbPCTmjXsqYz6Nlh97tM0LA0fttQbBXHiiNf9wBFbEhA3Zg6PLM6_sqYlPcNsvbPOGhS14dV36tTIwnjGsV71oeQ3kSiOYQ","width":1600}],"place_id":"ChIJy3dl287Jj4ARq4yV_OvOu9w","rating":4.2,"reference":"CmRSAAAAZyZ5_Iu-QUoh4n5GyaJmI3pC6Z917Jqhti9DhA9qO28We4ZNHzqU6fFU05fRHK1mB9fxjtO3seIcs6141druibzEyO24oFoj6FmfEG3C1AzTVN4mSz5zWPKtCggmTTlaEhAMgrr5PEivBCXhtD5Qq3DJGhQeN-6XDiASoHyqE2TwM-p1oiubDA","scope":"GOOGLE","types":["lodging","restaurant","food","point_of_interest","establishment"],"vicinity":"4949 Great America Parkway, Santa Clara"},{"geometry":{"location":{"lat":37.44056889999999,"lng":-122.1631209},"viewport":{"northeast":{"lat":37.44181018029149,"lng":-122.1619269197085},"southwest":{"lat":37.43911221970849,"lng":-122.1646248802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"db8178a147741973967b873bd246b1f9f38a6224","name":"Restaurant Soleil","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2432,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112558246117709843437/photos\">Sarah Chan<\/a>"],"photo_reference":"CoQBdwAAAP4R92iDAnvdb4Axhy4FADwPmp1f9fbULsstQA51DSk1Eijw2bluwhRMSuvFMC90WNgtyNSGgeN2Nx4a5WOUISN-719wh4KTYffw9yXtQPb9C-TxG9KvV-qMZ_3IezV2j9nYXv0aduE_mFmAVHzJAAFSdzfUppx366SAAY_-diL1EhCnaO_bp1UiwezqU7vtlG-6GhS3qJ5zb5gmTwuyFxCIdgMaVLnhhg","width":4320}],"place_id":"ChIJIe9vfzC7j4ARKMPewN6Czv4","price_level":2,"rating":3.8,"reference":"CmRSAAAAhbfWoEtjflgL9Ti3Q34DjYRxdPpaEr_jWM6aLDytd4nWbc28B11K4FPkrP751OBTusNR01GEjwLMqw_7EPRy7Mhr1aht5hR8Yteyte3S49yysTmwlOBc0ZITsq7Hdr3MEhCil1oCBfXqTaeFJtpXdjpvGhRO9yP5vfrnwlYUu10SF6K7qyg28A","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"675 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.44888899999999,"lng":-122.158481},"viewport":{"northeast":{"lat":37.4502750302915,"lng":-122.1571895197085},"southwest":{"lat":37.4475770697085,"lng":-122.1598874802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"57f2ed24db60a6c2fc542d7ba703b50e14725b7d","name":"Tamarine Restaurant & Gallery","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1630,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/111421460378105628572/photos\">Tamarine Restaurant &amp; Gallery<\/a>"],"photo_reference":"CoQBdwAAAD2JeJTap6CEE6cn3hubSo-kJJBH-eVgEPlaxXMXNAPLdHZQu87Vh64qZb0WX9QceFiefLfseJ1tJlWsNIXEM2Rg6c4r98MRxY-_elhJsVN_aM_pqZUV4ZMIi3axxf-aojH-lYn1T2BEI68Ihu-D79n0t0H55b22IpqWtO51ZJ-FEhDruLdPrPGr-AC22qv2wK-HGhThcLrL2AqAiMepd3bantewWxm6wQ","width":1633}],"place_id":"ChIJwWcdxzi7j4ARSPpV37nhr58","price_level":3,"rating":4.3,"reference":"CmRSAAAAZxlWameu0h3y_DXblHN74EjOsofhVQ9lKbtqxXkjxc3U12eoRsoKtOziaJyDi_iP3U3PeOXtEdrb3uJ1Dv9GNOpvZdHmh0NqatGjLrzzvVOga5RXb66b6vh_FmgYB2kREhCPd9xYHAoxM4vHSxiC4CrjGhQErwU5qr02WxAEkG-D2p127veSig","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"546 University Avenue, Palo Alto"},{"geometry":{"location":{"lat":37.4445953,"lng":-122.1704183},"viewport":{"northeast":{"lat":37.44624778029149,"lng":-122.1687014197085},"southwest":{"lat":37.44354981970849,"lng":-122.1713993802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"32a50e0a52925328f3ff87c209b03739226d9e5f","name":"Fleming's Prime Steakhouse & Wine Bar","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108022704311670635179/photos\">Tomoyuki Sugizuru<\/a>"],"photo_reference":"CoQBcwAAAJ0Dn8ckUGmaIjsMWl4I38gn0sUJzoxOIv4AmGTHHa12ubA_vAEG0a_CWz3QTm4usoV216Nhlyfht02twPSUaMbzV1AnloGXIu7p-w8Kg5PJf2XqZFgv2h44I1-Pti87QraZtUEc8FJYclJYmUrb8PEfZ0eXdsMe-PUxLxJcXWudEhBOTbbWsLVopRH7Ua9oU1sHGhT_LZW_krn8ohsDV2w57SfrQdtWkQ","width":3264}],"place_id":"ChIJ2VtDOzS7j4ARaKOgGvJXoJ4","price_level":3,"rating":3.9,"reference":"CmRSAAAAVeBww3LXvQBz8vd6l2fOZul4L1fVFDMkyQt32C-YrtCrnpFu8khhe4PdMtxdnbSqaiEKH1eY8qjybcwbazJi2wnbdLt0rYzx8YEDWRKO577YTosoeFssC8tbiardJgFxEhC0qgO7KhQbbua3qBSQLzVJGhTx7us_wC-jlI3mtdSgOPbgZwjS5g","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"180 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.4439424,"lng":-122.1601842},"viewport":{"northeast":{"lat":37.4453170302915,"lng":-122.1588096197085},"southwest":{"lat":37.4426190697085,"lng":-122.1615075802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"696d46fd5b0bf5cd04824e490d6393d1f3c6cfbb","name":"Coconuts Caribbean Restaurant & Bar","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":2432,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/101914103744254764525/photos\">Guillermo Gomez<\/a>"],"photo_reference":"CoQBdwAAALJGjxCzw-h01bMezufm20A2wcary1OqMY0G2Oh5-xsMl8g9msdyA7G742ooWpD2VCFWsU68EgFRWXcFu6peBmw0hxXMz2z4qKu7G32u515YmgCmx8SF_HUX8f3w_ZccIp8fIKI8WW4wOtoNsppWP83g30teyTDKYuO5U5tGqBmwEhCKT5rV-DpFh6erQJWG2cgfGhS8bB9bmeYs8yk7MBiLODBRdG1TCQ","width":4320}],"place_id":"ChIJQ7QsMzq7j4ARidQmfZss-Wc","price_level":2,"rating":4.1,"reference":"CmRRAAAAeL1UE4Njmtcjy-uULVtx3MTcL30-bsqtKqei175ikbZxVfwXwygNLYnZ9UkLXZ0lhCD_rFdWkkboZwA33E3bUHUFmW8kXF8YGxGTC5ZKDt3if555vIYvc5BaO4-LoPRPEhAyQ7xiliEzzB_PjnLseqKYGhTIXwGuW4rC_jXi-rjuE5eztvXyGA","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"642 Ramona Street, Palo Alto"},{"geometry":{"location":{"lat":37.4209559,"lng":-122.093343},"viewport":{"northeast":{"lat":37.4222157302915,"lng":-122.0916691697085},"southwest":{"lat":37.4195177697085,"lng":-122.0943671302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"0bcc1b956fb24beae439eccdc5db92ac3e2e87e6","name":"In-N-Out Burger","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3036,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107085266900115818933/photos\">Deborah Maufer<\/a>"],"photo_reference":"CoQBdwAAAHsm-p5Zt56m5ZFyUxmbm9M7N6u8g_yUzyNenUS0qYjziJeluFISm5cxTHeseVkRgYge6SnoLbQWvfzOGCXNDFBHqhAl_PGZZgvyPp4NZFDu2pPtatgA-OaWLIJuXk5rgv9i_ahEbf2_JARXW-UelHvPfvf9WToiolSH8PsePPfREhALUegAlStYJBPZI4KRT4ZLGhQYdQZ1oV4IZ_xM_8lRbtCukP1cMA","width":4048}],"place_id":"ChIJ5V-QXKiwj4ARv5e-BSB9fiA","price_level":1,"rating":4.3,"reference":"CmRRAAAAQ9_WiwgL-CR50SRtHigrj0OFdZdFUu5-jiRL1o0zmYUZiW1YLYKddDeQGk3iV_ajea1QQ-OvSg7_rC5lctBMPGsIeC1GR2vxS0xP-eO7j4uMnpI_BEE29W3SAxBavfqOEhB1f1-DgQfN9Swd8qmHi5c9GhTudzUxmxxTPTyyghvkRSx48GWk_A","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"1159 N Rengstorff Ave, Mountain View"},{"geometry":{"location":{"lat":37.3899355,"lng":-122.0422884},"viewport":{"northeast":{"lat":37.3911869302915,"lng":-122.0407650697085},"southwest":{"lat":37.3884889697085,"lng":-122.0434630302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"f3807ed26c26ab109b96b02d0580d4c176ed073e","name":"Subway","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":4032,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/100734039619700652453/photos\">Roman Nahal<\/a>"],"photo_reference":"CoQBdwAAAEsqw9spKtYt9UNc_5d-lClN9Mmwcm_go0JLLNzqNyv0K72OU3hHOpl4olqiDNvfOCZeuj9ln_tqtEosocluq-SPW2mo5cySJVz7QTMZ8vE4jlO7dfFCp1M6hEuvbjwrTFOJtQFSOKuBDHSc57KCiJYOjbwYGsxAdhflrKnNcg6SEhCFvbzApsolceSLaZcFNHcGGhTCV5PiSgNQc4ulwUVal5ZNs6RhrQ","width":3024}],"place_id":"ChIJkQtw0AG3j4ARIXn997_1d7o","price_level":1,"rating":3.1,"reference":"CmRSAAAAJIcxPyEVSRHfG91pQuHxpwuqAUrLStZBYlxWYpRTYIjnEJjbX-_YPmRUCfRqfJLHB4qYO2isPlzr8hVtdEQRI2PsTNRmlaL2WXsNaWEdJDIZvzFbeHxPu9sFVa3uKVrCEhC2JtJuYfBk2-rGzOsu5TikGhSTdpVugt4Y2mZhPXc1Az-xGcIHEg","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"415 North Mary Avenue #105, Sunnyvale"},{"geometry":{"location":{"lat":37.4479038,"lng":-122.1588608},"viewport":{"northeast":{"lat":37.4493093802915,"lng":-122.1574546697085},"southwest":{"lat":37.4466114197085,"lng":-122.1601526302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"8bb54442aa942148a8601407673aa93a3febfdb5","name":"Il Fornaio","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104131262007460355563/photos\">Charlie Case<\/a>"],"photo_reference":"CoQBdwAAAMaUjuZQcrWmgS_ofJURBDsIWaNvxoZk_lpLfPfn-J8Y12z_hOPADZc9OaO4PORQyNYfV-RT5q8g1fXyJY9cky6PZ-tZUos520vmOTsFmfbRwIaRy3PZzA1pF0KnXdWdobdWpEt3gb5xuyXm1ciAlOSByZmIqO9N9t40842sP2-AEhBHwlkfZIgltjxbsX7WtUFSGhSmcQMnxXlCnvBpMm-X2GU5UmcKww","width":4032}],"place_id":"ChIJpf2l3zi7j4ARq9jTYIKdfb0","rating":3.7,"reference":"CmRSAAAAD6dvFevo_wgF7b_qcPu0k2GT2TStnn-fFBW_YltMBsU5EwDrDU-zN6EiaY2AgFpajkaQBHFZV1tmGTxutQDy1oNw_TyLQQmqJz1FVIV1fHWt6DY6Ba1oXMAGARE-G4HvEhCu0j2IF_kHr0w4078ifdLbGhTf4aW-PQ63wlKs6_Nq5VjLy7zwCw","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"520 Cowper Street, Palo Alto"},{"geometry":{"location":{"lat":37.4137821,"lng":-122.125388},"viewport":{"northeast":{"lat":37.4150325802915,"lng":-122.1242426697085},"southwest":{"lat":37.4123346197085,"lng":-122.1269406302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"7a3e801c44776e756ccf025bd40905dafc985976","name":"Tofu House","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":2688,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/109587251644829802255/photos\">Angela Liu<\/a>"],"photo_reference":"CoQBdwAAAGfIRBiXqeyYLNS490XIK0rVScQGBOMj8BtrC8unAe0ntqOYXxzQIVJ1Fa13sbBl4cpAYqWN8rdHFLPWEmdA39gPp-WLuJj3Ob08zm0YhaeVaRz_2nAxJo95SqWSqIr8RUWcR55IbYEZuvXP1jV4CJG0WcGEcwXo8Mo_OWaM2gCHEhDCDJdUT0tuxsB2JiYOkevzGhSlvUM2w6WzxbELxc11L-Dab6uRDw","width":1520}],"place_id":"ChIJtWFrFmO6j4ARbA4cFdc8mG0","price_level":2,"rating":4.4,"reference":"CmRRAAAA-__QwGrTw9zDcJb0HpT8BS_RmFcGq2N67YA8SAy5mFxozZ2voTseCDBi1vGtAh_EWey-1L31tCmUL6geMjq9Jz0QJQcbDF-Z8Zsq-7Nvm9aFEQEiBY37IyKXSvvRiE3eEhCVsCpUNRzdHirp3jtLQ8gFGhTq7Oa09q1RiM4sV964rLpWbl0mMA","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"4127 El Camino Real, Palo Alto"},{"geometry":{"location":{"lat":37.380407,"lng":-122.0740344},"viewport":{"northeast":{"lat":37.38188523029149,"lng":-122.0725844697085},"southwest":{"lat":37.3791872697085,"lng":-122.0752824302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"3e1d06e0554de5e24ddee472276254b4652758e0","name":"In-N-Out Burger","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3008,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102573246321598664037/photos\">Kevin Fung<\/a>"],"photo_reference":"CoQBdwAAAIi9tjbBEzsNqI6OIQswLfj6B3WYBv9ipcePB46TxIxHksgj1PfiaDVS2HFUilbg_BE5_M-EDstOgTmZVhUA9OaoMi6JPSP1RwDyQV_7Yj9G8dmg-eD2G1vinVxUU_WLBhxoY-3BQU1qIez-l37Mv_alnM4WvCQhMetUSLMwODTHEhCw6JOMcwaz7A6xkroYdQNeGhTgqcN0Qy--_rC5utc5MHtIA_x1AA","width":4011}],"place_id":"ChIJnd9jPSi3j4AR5m7u0VrveB8","price_level":1,"rating":4.2,"reference":"CmRRAAAAPxUtU-jgOgkyBKNa_loGTL0Ny4Y9DsLWeH_wpxG4-5Q9PlojB7n_5Q_kSWslvoCxX0qquLNl6uLCE7-tFxxO9rebhEZDQ_9voFHNoLZGYkK4MqTAufsOTxLYj0KOq4DZEhC8IYIE3SMLxUXwne0OsGI_GhRAgZ9w3rn0dbYeOPp8yCmoAqQj2Q","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"53 West El Camino Real, Mountain View"},{"geometry":{"location":{"lat":37.3691655,"lng":-122.038418},"viewport":{"northeast":{"lat":37.3706070802915,"lng":-122.0370323197085},"southwest":{"lat":37.3679091197085,"lng":-122.0397302802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"930a603649e6c94fee2c66f938c31977f674b5d7","name":"Chick-fil-A","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3036,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115183092671087030332/photos\">Sean McQuay<\/a>"],"photo_reference":"CoQBdwAAAMNq6kY5GvvI8V-rPnSa7sw8HJwDn87qHLqqMuPtZQI4JJUkt2jTkICC8mKcs1A_macl2CKwQqbuvXf67TMKS8DumQrylT8MHY4yx3dAirt0d348O6EdloxT3FQ5j27MJ-DLxHm2YIH7cFaaImQCoc5B_t59ApBM_GJ4R94SM6PqEhCYjHj8x7ZKlKYxF3AE7k-HGhQjv3yJHpxWaHrtBGbeyyg4YsTqgw","width":4048}],"place_id":"ChIJl6iCf4q2j4AR9bQRu7_0fHI","price_level":1,"rating":4.5,"reference":"CmRRAAAALRZIHH8dlZ8C14R9u4lOHcdzE8prQEWgqOO8wZb5Yq6_RcB_6lU82ZI8KbLyLkB2awmwYuJNCK7eZGFvvUvg-8NVIH_xLNefU5WDD5xThW4Tv6qqOsHRFJalmGUJTw51EhDMjUFDUHjGQ3HljQeN8ShtGhSnhNGmKrzmcnqT93RwLOQC4qA73Q","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"550 West El Camino Real, Sunnyvale"},{"geometry":{"location":{"lat":37.4254593,"lng":-122.1451677},"viewport":{"northeast":{"lat":37.42684613029149,"lng":-122.1439381697085},"southwest":{"lat":37.4241481697085,"lng":-122.1466361302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"044502b9472f422e3b9cfe518eda2ec2b0050f0d","name":"La Bodeguita Del Medio","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":864,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115694020599999516944/photos\">Dennis Hernandez<\/a>"],"photo_reference":"CoQBdwAAAO8rh4HOV5d6cBQAF7xhnE3tuBPEby27PqzaI5PfpiR9wL9E1Hzw3ZQD1t5X02v6yc9vevZ5DS-wyPKnrhI5Fi-RMwpi6H5yxjy29hb72ZEl-M3UbewQhBbZNA24WX7cnwKg6Q9za5bI8LemORuiuzrc14o1759pgPYqOcKn4yHDEhCPE8L2rmVCYUHT1xmAK2PBGhT8ZUgX0JGiAI6u6oza_a7vQsKHEg","width":1152}],"place_id":"ChIJRbsp9uW6j4ARyUJHxK7xFX8","price_level":2,"rating":4.3,"reference":"CmRRAAAAYRMr7cdBabIEIemAqUcAOWXNDYJBStHy9E0Y07Hwq2wI_yEZavt-eq1WRPI1Bm7zcLnkUKNkZ0Kj_RUFe4oJCrBxoNe-cn-tEteiO0DNL9B0Nv9eZfNy0IJ7D48fSg24EhAqxOUeBw4T2sC5QUfE46n5GhQiEkHZIn_fTCr5QrHzku6kXrvVsw","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"463 California Avenue, Palo Alto"},{"geometry":{"location":{"lat":37.376177,"lng":-122.030136},"viewport":{"northeast":{"lat":37.3775478802915,"lng":-122.0288895197085},"southwest":{"lat":37.3748499197085,"lng":-122.0315874802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"e94f11c5119ef0c45ad3786ca3f578352d78980b","name":"Dishdash","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1200,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/116848797527124353937/photos\">Sachin Gupta<\/a>"],"photo_reference":"CoQBdwAAAE20j17WxdORAygSqgsaQOGXnbIh4epOXAam7B-IPXntx8E5TOrbQnhMrZ7BogYvumtaqS-V0pxmB9s3gvUSMxygCHyM-4CXjLbcZ_LKqElE0I2HETAou6Mvj65KUmu_js4RGVqyLldz5iZCA_okpYvJi7VCpClxvEhnj0d-RqhKEhDkkK4f2cP3M4diKqILbEMqGhRny4sLeZ9g-m4ZQxtcFlU5QKV74Q","width":1600}],"place_id":"ChIJS-AArV22j4AR1rJD3ENugCU","price_level":1,"rating":4.4,"reference":"CmRRAAAAwvWEmnUhFtCwHLOATjetuGakuhqHm5QGXJshyjecnJIKcbsbsRtFAxFg-TmbkuP6AETvdHyeuI8z_azKw73HY3QJcEkPl2PusB_ujOhHKApE8mYILL2gfdRxkaU1pNd9EhBYqrFFI7Ck79ydEx2kTiHZGhTYpyqc_BYNHz-GDPuDZzx4lZHluw","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"190 South Murphy Avenue, Sunnyvale"},{"geometry":{"location":{"lat":37.44503270000001,"lng":-122.1613454},"viewport":{"northeast":{"lat":37.4462981302915,"lng":-122.1600802697085},"southwest":{"lat":37.4436001697085,"lng":-122.1627782302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"51af9a830e154d190da12b89cec07c5ff7119c80","name":"Nola - Palo Alto","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110889299777873609862/photos\">Gary Clark<\/a>"],"photo_reference":"CoQBdwAAAM4pku5ihOsQQ2EEOMlVGcXCyHQv3ngEhmbbxEhJ7G_Q3AX7-zwTNrilj6w_nNQ6Ais8wryWeNG2VhNSEhVTLKRKZTN5og8FfkWoD3rxLLD6aDn-w6kmJpSucCYEz-o7hn3gXYSBiAr3acs0KvvbweAp-UtWAsfBtGelZWZ026G4EhBqqbnMAa64bCXsVSgUbG5nGhTVvt2SXezbM5xq6omEhDc_1MnxPA","width":4032}],"place_id":"ChIJdwmtjjm7j4ARuuLA95wq7wQ","price_level":2,"rating":4,"reference":"CmRRAAAA9FyD1zh_2Nf4EN0iCwm2nk_vjukD8-xEEmkxdlsjBZ8YCQCXIsnNqm4br0WHrBeTcJ2Km3rnuIFK7JDPEOD3yo-vic43AI-Evwi6TRt-kH6sJhItD-EcLAPn78uzN_RoEhDpEyqKB-fPyDSPR3A6Ah64GhSEW9FnFHB-HWMd_wnt3RwPlHvJ1A","scope":"GOOGLE","types":["night_club","bar","restaurant","food","point_of_interest","establishment"],"vicinity":"535 Ramona Street, Palo Alto"},{"geometry":{"location":{"lat":37.378222,"lng":-122.114857},"viewport":{"northeast":{"lat":37.3795098802915,"lng":-122.1136305197085},"southwest":{"lat":37.37681191970851,"lng":-122.1163284802915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"46ed8b9bb279f4e6c8a2fbb2c4dc17896654fac8","name":"Los Altos Grill","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1360,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104810297016673356515/photos\">Los Altos Grill<\/a>"],"photo_reference":"CoQBdwAAAKEdmeJvgt-rkWLdgB89iXtjNjhLqJ-sdLAlylg4PJpopFO2O5ZZfhMMOxAM6WiISzkfPS4Q_DH7W4XT3pwZ-nVqhB52Ov3QLPP0uLRo5Cn961dSuqkEHOkwvhKrCOeZwYXHLzXuBlzGEASNCSutHZwEOEHPra8W3hnbSApgeDH8EhBCioEeBL3ntM9gllT9V4yeGhSHw85Ui4nb97qELS0MwzgJCbjBPw","width":1338}],"place_id":"ChIJWUOqde-wj4ARvFRj5XeG0CY","price_level":2,"rating":4.4,"reference":"CmRRAAAAvKNkFEtMqFWh8b4IAa7g0a5IfANEsRd95592bd--OyRp576IdkXpOghp_DIqm6sY9Sm64fu1DQ3Vo9AmUbmd2c4hLdhWO1GT3aY44GqWU5ejOPqBt6OCpa9126pcsOXOEhCc4cVGTotpLa9vLi9-5kx4GhS7n93n87szYtkUnIElb-KH0R4ODA","scope":"GOOGLE","types":["restaurant","food","point_of_interest","establishment"],"vicinity":"233 3rd Street, Los Altos"},{"geometry":{"location":{"lat":37.3769745,"lng":-122.0304338},"viewport":{"northeast":{"lat":37.3782888802915,"lng":-122.0289226697085},"southwest":{"lat":37.3755909197085,"lng":-122.0316206302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"a8e8cd60ddd76bd87077c52b30ff6a7d89c7dde8","name":"Turmeric Restaurant","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":350,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/106150915725490142785/photos\">Turmeric Restaurant<\/a>"],"photo_reference":"CoQBdwAAAOzZDFoiPv27DmSEsQgsLdoXW3PHNTa7RmRLissu76TJt8hl-9gYaKJYZpoDQCVZoWBuKw7B-qtiAoLA4qZmhLTLW8v52WHI9Ttle7-CatU1iNOrSFwoSyG2tqwKjxqVBS1K5oL1r1oHwjn-CseZgkn5Yv66uCVKFbSXJPdW73b9EhARSXIfdw2-NQI4Q2U5ugoNGhTGUyO5aG8YwHlAQFNpN-GXUD8mPw","width":351}],"place_id":"ChIJMf-AUFy2j4ARBwnev5VPorM","price_level":3,"rating":3.6,"reference":"CmRSAAAA7aWMWwWUkZ46UShnMrfQ_xTnNMXuB4IdY1_9BVZMoRDFNr4Dn9geOGGX5kBi0asSFraG_809jsdebxzQMg9cWFa-jd6MHMTr3_FMa6FfzW1iWEqXPrmJb069Ye_XHNZREhCF5WTz2LsISnT3loqevfODGhRVoGlHLbcABym7rdvh1vlNIZAggA","scope":"GOOGLE","types":["bar","restaurant","food","point_of_interest","establishment"],"vicinity":"141 South Murphy Avenue, Sunnyvale"},{"geometry":{"location":{"lat":37.4442255,"lng":-122.1610732},"viewport":{"northeast":{"lat":37.4456013302915,"lng":-122.1597658697085},"southwest":{"lat":37.4429033697085,"lng":-122.1624638302915}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png","id":"1926a0e69e97b0710433c98116c3735098b070fa","name":"Reposado","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":3024,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112417919317910781482/photos\">David R Robinson<\/a>"],"photo_reference":"CoQBdwAAABqEk6677ySC1PjPQR5B8D9fBNge2nbr8g7slGMNjgAYkbTh2E9g6tFHEaRirfpBI25Y1Ogzix5vRZ5NtWJyIR91Rq7ijY97DZ3QhMwkUIGQ3a4I0EcZO5A2FgA0HsnG1Zf8kIHEGDzcnqbRsTCaQso6rYNfzByHl_wSPRf40lUhEhBUyStQ2GR1BWJERcdSTppQGhQtKOUHLAWLc1tZCYWQYrIU1_3zQQ","width":4032}],"place_id":"ChIJY0yKLzq7j4ARNNLYPbJMgN8","price_level":2,"rating":4.1,"reference":"CmRSAAAAuwhekrS_E33K6I1ZAIUSjWTL-aB4uuwCCSha8xImBxInG8rJ4buaH-zluV5I986p1gWDukR0MHyoy998Fr9hejmF32sYxxImo9NaXMU9W0FTfMwKMfn34aG6kFRYqBs5EhBiBILBYcLiCl7IA7GkUh-pGhQTDvc-XBXmEvko0UPifBsf6xZVzQ","scope":"GOOGLE","types":["restaurant","bar","food","point_of_interest","establishment"],"vicinity":"236 Hamilton Avenue, Palo Alto"}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
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

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Serializable {


        /**
         * geometry : {"location":{"lat":37.4082392,"lng":-122.1197784},"viewport":{"northeast":{"lat":37.4092879302915,"lng":-122.1190242197085},"southwest":{"lat":37.40658996970851,"lng":-122.1217221802915}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png
         * id : 73794679484e426aadc7c6cfdb1026864beea194
         * name : Dinah's Garden Hotel Palo Alto
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * photos : [{"height":910,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115212688446356792868/photos\">Dinah&#39;s Garden Hotel Palo Alto<\/a>"],"photo_reference":"CoQBdwAAAHo-HLlO3Bk9Z_Pf2pVcLaHxrELAREl4gsSYW6MI1hH_jbeT_KAPSS0TPNhuejERTk_CLsfu2kBr1MOcnV6oGb6saP7ZeUv8Pzc9byvnrg7jzi20AjIB5cAB9p6dJpFu4p-YPEGQcJrEZisoPwQDI2CpCLWDjXrshEit5Z8LsEDLEhA7eGE3acaZPDQyL8doWJWiGhRi6C1EMPVxUoC-zx6-hsHfZid4Sw","width":909}]
         * place_id : ChIJxUf2lnm6j4ARf-dI1c4L9sA
         * rating : 4.1
         * reference : CmRSAAAAsU-9Ff7JaUQyfYFluwQwHL4lY3XHejNb1Yxg64XZdQiiJUDPj_Xmmo2_B_H2W0qLTxnlQf-YTnm6ivv7x21MJMLTAOMbdni3MWtITj1odwJdTjMLa8Xfm4K6vzVfGQwoEhDMIRKto2nUhOL4N5dicT-LGhQHzBTkLiSe3CCFXudQxSeRw0mpjw
         * scope : GOOGLE
         * types : ["lodging","restaurant","food","point_of_interest","establishment"]
         * vicinity : 4261 El Camino Real, Palo Alto
         * price_level : 2
         */


        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private OpeningHoursBean opening_hours;
        private String place_id;
        private double rating;
        private String reference;
        private String scope;
        private String vicinity;
        private int price_level;
        private List<PhotosBean> photos;
        private List<String> types;

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

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public int getPrice_level() {
            return price_level;
        }

        public void setPrice_level(int price_level) {
            this.price_level = price_level;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean implements Serializable {
            /**
             * location : {"lat":37.4082392,"lng":-122.1197784}
             * viewport : {"northeast":{"lat":37.4092879302915,"lng":-122.1190242197085},"southwest":{"lat":37.40658996970851,"lng":-122.1217221802915}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean implements Serializable {
                /**
                 * lat : 37.4082392
                 * lng : -122.1197784
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

            public static class ViewportBean implements Serializable {
                /**
                 * northeast : {"lat":37.4092879302915,"lng":-122.1190242197085}
                 * southwest : {"lat":37.40658996970851,"lng":-122.1217221802915}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean implements Serializable {
                    /**
                     * lat : 37.4092879302915
                     * lng : -122.1190242197085
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

                public static class SouthwestBean implements Serializable {
                    /**
                     * lat : 37.40658996970851
                     * lng : -122.1217221802915
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
        }

        public static class OpeningHoursBean implements Serializable {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

    }
}
