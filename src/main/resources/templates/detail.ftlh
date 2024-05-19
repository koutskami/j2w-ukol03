[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
        <div class="detail">
            <div class="vizitka">
                <div class="jmeno">[#if vizitka.jmeno??]${vizitka.jmeno}[#else]<em>neuvedeno</em>[/#if]</div>
                <div class="firma">[#if vizitka.firma??]${vizitka.firma}[#else][/#if]</div>
                <div class="udaje">
                    <div class="adresa">
                        <div>[#if vizitka.ulice??]${vizitka.ulice}[#else][/#if]</div>
                        <div><span>[#if vizitka.obecPsc??]${vizitka.obecPsc}[#else][/#if]</span></div>
                    </div>
                    <div class="kontakty">
                        <div><i class="las la-at"></i> <span>[#if vizitka.email??]${vizitka.email}[#else][/#if]</span></div>
                        <div><i class="las la-phone-alt"></i> <span>[#if vizitka.telefon??]${vizitka.telefon}[#else][/#if]</span></div>
                        <div><i class="las la-globe"></i> <span>[#if vizitka.web??]${vizitka.web}[#else][/#if]</span></div>
                    </div>
                </div>
            </div>
            <div class="mapa">
                <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%" frameborder="0"></iframe>
            </div>
        </div>
</body>
</html>
