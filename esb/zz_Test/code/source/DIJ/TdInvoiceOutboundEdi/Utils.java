package DIJ.TdInvoiceOutboundEdi;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.math.BigDecimal;
// --- <<IS-END-IMPORTS>> ---

public final class Utils

{
	// ---( internal utility methods )---

	final static Utils _instance = new Utils();

	static Utils _newInstance() { return new Utils(); }

	static Utils _cast(Object o) { return (Utils)o; }

	// ---( server methods )---




	public static final void checkZRQual (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(checkZRQual)>> ---
		// @sigtype java 3.5
		// [i] recref:1:required E1EDKA1 TdDocuments.Sap.Common:E1EDKA1
		// [o] field:0:required isExists
		String isExists="";
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// E1EDKA1
			IData[]	E1EDKA1 = IDataUtil.getIDataArray( pipelineCursor, "E1EDKA1" );
			if ( E1EDKA1 != null)
			{
				for ( int i = 0; i < E1EDKA1.length; i++ )
				{
					IDataCursor E1EDKA1Cursor = E1EDKA1[i].getCursor();
						String	__SEGMENT = IDataUtil.getString( E1EDKA1Cursor, "@SEGMENT" );
						String	PARVW = IDataUtil.getString( E1EDKA1Cursor, "PARVW" );
						String	PARTN = IDataUtil.getString( E1EDKA1Cursor, "PARTN" );
						String	LIFNR = IDataUtil.getString( E1EDKA1Cursor, "LIFNR" );
						String	NAME1 = IDataUtil.getString( E1EDKA1Cursor, "NAME1" );
						String	NAME2 = IDataUtil.getString( E1EDKA1Cursor, "NAME2" );
						String	NAME3 = IDataUtil.getString( E1EDKA1Cursor, "NAME3" );
						String	NAME4 = IDataUtil.getString( E1EDKA1Cursor, "NAME4" );
						String	STRAS = IDataUtil.getString( E1EDKA1Cursor, "STRAS" );
						String	STRS2 = IDataUtil.getString( E1EDKA1Cursor, "STRS2" );
						String	PFACH = IDataUtil.getString( E1EDKA1Cursor, "PFACH" );
						String	ORT01 = IDataUtil.getString( E1EDKA1Cursor, "ORT01" );
						String	COUNC = IDataUtil.getString( E1EDKA1Cursor, "COUNC" );
						String	PSTLZ = IDataUtil.getString( E1EDKA1Cursor, "PSTLZ" );
						String	PSTL2 = IDataUtil.getString( E1EDKA1Cursor, "PSTL2" );
						String	LAND1 = IDataUtil.getString( E1EDKA1Cursor, "LAND1" );
						String	ABLAD = IDataUtil.getString( E1EDKA1Cursor, "ABLAD" );
						String	PERNR = IDataUtil.getString( E1EDKA1Cursor, "PERNR" );
						String	PARNR = IDataUtil.getString( E1EDKA1Cursor, "PARNR" );
						String	TELF1 = IDataUtil.getString( E1EDKA1Cursor, "TELF1" );
						String	TELF2 = IDataUtil.getString( E1EDKA1Cursor, "TELF2" );
						String	TELBX = IDataUtil.getString( E1EDKA1Cursor, "TELBX" );
						String	TELFX = IDataUtil.getString( E1EDKA1Cursor, "TELFX" );
						String	TELTX = IDataUtil.getString( E1EDKA1Cursor, "TELTX" );
						String	TELX1 = IDataUtil.getString( E1EDKA1Cursor, "TELX1" );
						String	SPRAS = IDataUtil.getString( E1EDKA1Cursor, "SPRAS" );
						String	ANRED = IDataUtil.getString( E1EDKA1Cursor, "ANRED" );
						String	ORT02 = IDataUtil.getString( E1EDKA1Cursor, "ORT02" );
						String	HAUSN = IDataUtil.getString( E1EDKA1Cursor, "HAUSN" );
						String	STOCK = IDataUtil.getString( E1EDKA1Cursor, "STOCK" );
						String	REGIO = IDataUtil.getString( E1EDKA1Cursor, "REGIO" );
						String	PARGE = IDataUtil.getString( E1EDKA1Cursor, "PARGE" );
						String	ISOAL = IDataUtil.getString( E1EDKA1Cursor, "ISOAL" );
						String	ISONU = IDataUtil.getString( E1EDKA1Cursor, "ISONU" );
						String	FCODE = IDataUtil.getString( E1EDKA1Cursor, "FCODE" );
						String	IHREZ = IDataUtil.getString( E1EDKA1Cursor, "IHREZ" );
						String	BNAME = IDataUtil.getString( E1EDKA1Cursor, "BNAME" );
						String	PAORG = IDataUtil.getString( E1EDKA1Cursor, "PAORG" );
						String	ORGTX = IDataUtil.getString( E1EDKA1Cursor, "ORGTX" );
						String	PAGRU = IDataUtil.getString( E1EDKA1Cursor, "PAGRU" );
						String	KNREF = IDataUtil.getString( E1EDKA1Cursor, "KNREF" );
						String	ILNNR = IDataUtil.getString( E1EDKA1Cursor, "ILNNR" );
						String	PFORT = IDataUtil.getString( E1EDKA1Cursor, "PFORT" );
						String	SPRAS_ISO = IDataUtil.getString( E1EDKA1Cursor, "SPRAS_ISO" );
						String	TITLE = IDataUtil.getString( E1EDKA1Cursor, "TITLE" );
		
						// i_1.E1EDKA3
						IData[]	E1EDKA3 = IDataUtil.getIDataArray( E1EDKA1Cursor, "E1EDKA3" );
						if ( E1EDKA3 != null)
						{
							for ( int i_1 = 0; i_1 < E1EDKA3.length; i_1++ )
							{
								IDataCursor E1EDKA3Cursor = E1EDKA3[i_1].getCursor();
									String	__SEGMENT_1 = IDataUtil.getString( E1EDKA3Cursor, "@SEGMENT" );
									String	QUALP = IDataUtil.getString( E1EDKA3Cursor, "QUALP" );
									String	STDPN = IDataUtil.getString( E1EDKA3Cursor, "STDPN" );
								E1EDKA3Cursor.destroy();
							}
						}
					E1EDKA1Cursor.destroy();
					
					
					if(PARVW.equals("ZR")){
						isExists="true";
					}
					
					
				}
				
				
				
			}
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "isExists", isExists );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void convertToImpliedDecimal (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertToImpliedDecimal)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	input = IDataUtil.getString( pipelineCursor, "input" );
		pipelineCursor.destroy();
		
			
		
		int string = Integer.valueOf(input);
		
		
		
		
		
		
		double result = BigDecimal.valueOf( string, 2).doubleValue();
		
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void javaTestService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(javaTestService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required sting1
		// [i] field:0:required string2
		// [o] field:0:required output
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		//int num1 =  (int) Double.parseDouble(IDataUtil.getString( pipelineCursor, "sting1" ));
		float num1 =   Float.parseFloat  ( (IDataUtil.getString( pipelineCursor, "sting1" )));
		int num2 = Integer.parseInt (IDataUtil.getString( pipelineCursor, "string2" ));
		pipelineCursor.destroy();
		
		
		 
		float output =  (num1 * num2);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "output", output );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

