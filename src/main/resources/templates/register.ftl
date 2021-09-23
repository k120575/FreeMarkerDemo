<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>註冊</title>
</head>
<body>
    <h2>GameBox註冊</h2>
    <div class="container">
        <form id="addMember" name="addMember" action="/demo/addMember" method="post">
            <div class="login-wrap">

                <div class="input-group">
                    <span class="input-group-addon"><i class="icon_profile"></i></span>
                    <input type="text" name="name" id="name" class="form-control" placeholder="登入帳號"
                           autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入欲設定帳號"/>
                </div>

                <div class="input-group">
                    <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                    <input type="password" name="password" id="password" class="form-control" placeholder="請輸入密碼"
                           data-rule-required="true" />
                </div>

                <div class="input-group">
                    <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                    <input type="password" name="password2" id="password2" class="form-control" placeholder="請再次輸入密碼"
                           data-rule-required="true" />
                </div>

                <div class="input-group">
                    <span class="input-group-addon"><i class="icon_profile"></i></span>
                    <select name="level" id="level" class="form-control">
                        <option value="" selected>---select---</option>
                        <option value="1">GB人員</option>
                        <option value="2">三方人員</option>
                        <option value="3">品牌人員</option>
                    </select>
                </div>
                <!--<div id="hint"></div>-->
                <#--            <button class="btn btn-primary btn-lg btn-block" type="button"  onclick="/addMember">註冊</button>-->
                <form action="/demo/addMember" method="post">
                    <input class="btn btn-primary btn-lg btn-block" type="submit" value="註冊">
                </form>
            </div>
        </form>
    </div>
</body>
</html>