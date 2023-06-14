import yfinance as yf

def getStock (stockName):
    stockN = yf.Ticker(stockName)
    stockT = stockN.history("1d")
    del stockT["Volume"]
    del stockT["Dividends"]
    del stockT["Stock Splits"]
    return(stockT)

ticker = input("what is the stocks ticker: ")
print(getStock(ticker))
