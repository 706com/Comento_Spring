// 3. Service 작성( 비즈니스 로직 작성 )
//interface로 yearloginNum을 정의합니다.

package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    
}

