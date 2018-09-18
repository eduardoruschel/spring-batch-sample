package br.com.exemplo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
 
 
public class MutualFundDataMapper implements FieldSetMapper<MutualFundDataDTO> {
 
    @Override
    public MutualFundDataDTO mapFieldSet(FieldSet fieldSet) throws BindException {
        MutualFundDataDTO mfData = new MutualFundDataDTO();
         
        mfData.setSchemeCode(fieldSet.readString(0));
        mfData.setIsinGrowth(fieldSet.readString(1));
        mfData.setIsinDividendReinvest(fieldSet.readString(2));
        mfData.setSchemeName(fieldSet.readString(3));
        mfData.setNav(fieldSet.readDouble(4));
        mfData.setRepurchasePrice(fieldSet.readDouble(5));
        mfData.setSalePrice(fieldSet.readDouble(6));
        mfData.setDate(fieldSet.readDate(7, "dd-MMM-yyyy"));
         
        return mfData;
    }
}
