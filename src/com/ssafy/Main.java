package com.ssafy;

import com.google.gson.JsonObject;

public class Main {

    public static void main(String[] args) {
        JsonObject params = new JsonObject();
        params.addProperty("text",
            "|구분 | 항목 | 세부항목 | 김주현 | 임호정 | 이산하 | 최승재 | 조세연 \n"
                + "|:-----------|:-----------:|:-----------------------------------------------|\n"
                + "|1 | 전원 이상여부 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |\n"
                + "|2 | 외관 파손여부 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |\n"
                + "|3 | 키보드 작동여부 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |\n"
                + "|4 | 마우스 작동여부 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |\n"
                + "|5 | 디스플레이 파손여부 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |\n"
                + "|6 | 구성품 확인 | 마우스, 어댑터, 가방, 어깨끈 | 이상없음 | 이상없음 | 이상없음 | 이상없음 | 이상없음 |");
        HttpUtil.getInstance().callApi(Constants.WEBHOOK_URL, params, "POST");
    }
}
